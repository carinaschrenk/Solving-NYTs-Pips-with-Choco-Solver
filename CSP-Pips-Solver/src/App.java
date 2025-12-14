import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.Variable;

import PipsGenerator.GeneratePipsInstance;
import model.PipsProblem;

public class App {

    /* -------------------------------------------------------------------------
    (A) Either run a folder of manually encoded pips instances 
    (B) Or create custom pips and solve them (in construnction)
    ------------------------------------------------------------------------- */
    public static void main(String[] args) throws ContradictionException {

        /* 
        (A)
        Options include: Easy, Medium and Hard 
        */ 
        // runFolder("Easy", "result.csv"); 


        /* 
        (B)
        Options Include {L, Staircase, Square} x {Single, Equals, Sum}
         */
        String boardType = "Square";
        String constraintType = "Sum";
        setupOutputFile("result.csv");
        int runs = 100;

        PipsProblem[] problems = new PipsProblem[runs];

        for (int i = 1; i <= runs; i++){
            GeneratePipsInstance generator = new GeneratePipsInstance();
            System.out.println("Generate Instance " + i + "----------------------");
            problems[i-1] = generator.makeCustomProblem(boardType, constraintType);
        }

        for (int i = 1; i <= runs; i++){
            solveAndTime(boardType + "-" + constraintType, ""+i, "result.csv", problems[i-1]);
        }

    }

    /* -------------------------------------------------------------------------
    Function for running entire folders of instances 
    Input: 
    - Specify the NYT difficulty (Easy, Medium, Hard)
    - Specify the name of the output csv
    Output:
    - Writes Runtimes + SearchNodes to csv file 
    ------------------------------------------------------------------------- */
    void runFolder(String condition, String outputFile){
        
        // Get list of files 
        File directory = new File("/Users/carin1/Documents/02 Master Studium Inhalte/Semester 3/Scientific Writing/CSP-Pips-Solver/bin/pips_instances/" + condition);
        File[] files = directory.listFiles();

        // Get class loader
        URLClassLoader classLoader;
        try {classLoader = URLClassLoader.newInstance(new URL[] { directory.toURI().toURL() });} 
        catch (MalformedURLException e) {e.printStackTrace(); return; }

        // Set up Outputfile 
        setupOutputFile(outputFile);

        // Loop through instances compile and solve them -----------------------

        // For each file 
        if (files != null) { 
            for (File file : files) {

                // Check if it is a .class file 
                if (file.getName().endsWith(".class")) {

                    String instanceID = file.getName().replace(".class", "");
                    
                    // Compile 
                    PipsProblem problem = compileInstance(condition, instanceID, file, classLoader); 

                    // Solve and Time 
                    solveAndTime(condition, instanceID, outputFile, problem);
                }
            }
        }
    }

    /* Helpers -------------------------------------------------------------- */

    // Given a file and a class loader compile the instance to a pipsproblem 
    static PipsProblem compileInstance(String condition, String instanceID, 
                                        File file, ClassLoader classLoader){

        // Invoke the constructor
        PipsProblem problem;    
        try {
            Class<?> className = Class.forName("pips_instances." + condition + "." + instanceID, true, classLoader);
            problem = (PipsProblem) className.getDeclaredConstructor().newInstance();
        } 
        catch (ClassNotFoundException e) {e.printStackTrace(); return null;} 
        catch (NoSuchMethodException e) {e.printStackTrace(); return null; } 
        catch (InstantiationException e) {e.printStackTrace(); return null; } 
        catch (IllegalAccessException e) {e.printStackTrace(); return null;} 
        catch (InvocationTargetException e) {e.printStackTrace(); return null;} 

        return problem;

    }

    // Set up Output CSV File
    static void setupOutputFile(String outputFile){
        try (FileWriter writer = new FileWriter(outputFile)){
            String line = "Condition;" + "instanceID;" + "nD;" + "Time1;" + "Time2;" + "Time3;" + "SearchNodes1;" + "SearchNodes2;" + "SearchNodes3" + "\n";
            writer.write(line);
        }
        catch (IOException e) {e.printStackTrace();}
    }

    // Given a problem and an outputfile, solve it and write results to file 
    static void solveAndTime(String condition, String instanceID, 
                              String outputFile, PipsProblem problem){
        
        Model mymodel = problem.CreateCSP();                
        Solver s = mymodel.getSolver();

        // Warm-up (Run once and dont record)
        s.solve();
        s.hardReset();

        // Run three times and remember runtime + search nodes 
        long[] times = new long[3];
        long[] searchNodes = new long[3];

        System.out.println("Running " + instanceID + "...");
        for (int run = 0; run < 3; run++){

            long start = System.nanoTime();

            // Solution Found  
            if (s.solve()){
                long end = System.nanoTime();
                long duration = (end - start)/1000000; 
                if (duration == 0) {duration = 1;}
                times[run] = duration;
                searchNodes[run] = s.getNodeCount();
                System.out.println("\t Solution found in " + duration + ".");
            }
            // No solution
            else {
                System.out.println("\t No Solution found.");
                times[run] = -1;
                searchNodes[run] = -1;
            }

            // Prepare for next run 
            s.hardReset();
        }
            

        // Write to output file
        try (FileWriter writer = new FileWriter(outputFile, true)){
            String ID = instanceID.replace(condition, "");
            String line = condition + ";" + ID + ";" + problem.nDominos + ";" + times[0] + ";" + times[1] + ";" + times[2] + ";";
            line = line + searchNodes[0] + ";" + searchNodes[1] + ";" + searchNodes[2] + "\n";
            writer.write(line);
        }
        catch (IOException e) {e.printStackTrace();}
                    

    }

    // Old 
    static void printDomains(Variable[] vars) {
        for (Variable v : vars) {
            if (v instanceof IntVar) {
                IntVar iv = (IntVar) v;
                // toString() of IntVar in Choco prints the domain (e.g. X = [1,4] or X = {1,3,4})
                // we'll print both a compact string and the numeric LB/UB
                System.out.printf("  %s : %s  (LB=%d, UB=%d)%n",
                iv.getName(),
                iv.toString(),       // domain representation
                iv.getLB(),
                iv.getUB());
                } 
            else {
                System.out.printf("  %s : %s%n", v.getName(), v.toString());
            }
        }
    }
}
