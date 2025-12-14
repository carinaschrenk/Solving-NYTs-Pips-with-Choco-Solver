package model;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.constraints.extension.Tuples;
import org.chocosolver.solver.variables.IntVar;

public class PipsProblem {

    /* Problem Parameters that every Instance must define */

    // How many Dominos must be placed 
    public int nDominos;     
    // How many Squares are on the board 
    public int nSquares;
    
    // Provide a list of pairs of squares that are adjacent
    public int[][] adjacentSquares;
    // Provide a list of pairs, every pair is the numbers of one domino
    public int[][] dominoValues;
    // Is the union of all numbers occuring on the available dominos 
    public int[] allowedValues; 

    // List of all the respective constraints, null if not needed 
    public EqualsConstraint[] equalsConstraints;
    public UnequalsConstraint[] unequalsConstraints;
    public SumConstraint[] sumConstraints;
    public SmallerConstraint[] smallerConstraints; 
    public LargerConstraint[] largerConstraints;
    
    public PipsProblem(int nDominos, int[][] adjacentSquares, int[][] dominoValues,
                        int[] allowedValues,
                        EqualsConstraint[] e, 
                        UnequalsConstraint[] u, 
                        SumConstraint[] sum, 
                        SmallerConstraint[] s,
                        LargerConstraint[] l){

        this.nDominos = nDominos;
        this.nSquares = nDominos * 2;
        this.adjacentSquares = adjacentSquares;
        this.dominoValues = dominoValues;
        this.allowedValues = allowedValues;
        this.equalsConstraints = e;
        this.unequalsConstraints = u;
        this.sumConstraints = sum;
        this.largerConstraints = l;
        this.smallerConstraints = s;                
    }

    /* Creates the corresponding Constraint Problem in Choco  */
    public Model CreateCSP(){

        // 1. Model ------------------------------------------------------------
        Model model = new Model("My Model");

        // 2. Modeling the Instance in Choco -----------------------------------

        // 2.1 Model the Dominos -----------------------------------------------
        
        // Domino has two sides (A, B) modeled as integer variables.
        IntVar[] D_A = new IntVar[this.nDominos]; 
        IntVar[] D_B = new IntVar[this.nDominos]; 

        // Each side can be on any square of the board (value assigned) */
        for (int i = 0; i < this.nDominos; i++ ){
            D_A[i] = model.intVar("SideAofD"+i, 0, this.nSquares-1);
            D_B[i] = model.intVar("SideBofD"+i, 0, this.nSquares-1);
        }

        // 2.2 Constraints to Ensure Domino Sides are on Adjacent Squares ------

        // Create valid tuples from adjacency list 
        Tuples dominoPlacement = new Tuples(true); 
        for (int i = 0; i < this.adjacentSquares.length; i++){
            dominoPlacement.add(this.adjacentSquares[i][0], this.adjacentSquares[i][1]);
            dominoPlacement.add(this.adjacentSquares[i][1], this.adjacentSquares[i][0]);
            }
        
        // Apply to each domino
        for (int i = 0; i < this.nDominos; i++){
            model.table(new IntVar[]{D_A[i], D_B[i]}, dominoPlacement).post();
        }

        // 2.3 A Square may be Covered Exactly Once ----------------------------

        // Create array containing all sides of all dominos
        IntVar[] D = new IntVar[2*this.nDominos];
        for (int i = 0; i < this.nDominos; i++){
            D[2*i] = D_A[i];
            D[2*i + 1] = D_B[i];
        }
        
        // Restrict the occurence of each square id 
        for (int i = 0; i < this.nSquares; i++){
            model.count(i, D, model.intVar(1)).post();
        }
        
        // 2.4 Map Domino Placements to Squares --------------------------------
        
        // Need integer variables for each square (identified by square id)
        IntVar[] Squares = new IntVar[this.nSquares]; 
        for (int i = 0; i < this.nSquares; i++ ){
             Squares[i] = model.intVar("Square"+i, this.allowedValues);
        }

        // Loop over all dominos and squares and define the value of square s
        // if side A of domino d is on s
        for (int d = 0; d < this.nDominos; d++){
            for (int s = 0; s < this.nSquares; s++){
            
                // Disallow all values of Square[s] that are not the value on 
                // side A of domino d, when this side is on Square[s]
                Tuples mapping = new Tuples(false); 
                for (int v = 1; v <= 6; v++){
                    mapping.add((this.dominoValues[d][0] + v) % 7, s);
                }
                model.table(new IntVar[]{Squares[s], D_A[d]}, mapping).post();
            }
        }

        // Loop over all dominos and squares and define the value of square s
        // if side B of domino d is on s
        for (int d = 0; d < this.nDominos; d++){
            for (int s = 0; s < this.nSquares; s++){
                
                // Disallow all values of Square[s] that are not the value on 
                // side A of domino d, when this side is on Square[s]
                Tuples mapping = new Tuples(false); 
                for (int v = 1; v <= 6; v++){
                    mapping.add((this.dominoValues[d][1] + v) % 7, s);
                }
                model.table(new IntVar[]{Squares[s], D_B[d]}, mapping).post();
            }
        } 

        // 3. Apply Pips Constraints -------------------------------------------
        
        // 3.1 Squares must have equal numbers 
        if (equalsConstraints != null) {
    
            // Loop over all constraints specified 
            for (int i = 0; i < equalsConstraints.length; i++){
                EqualsConstraint c = equalsConstraints[i];

                // Create array of variables needed for the constraint 
                IntVar[] squareVars = new IntVar[c.squareidx.length];
                for (int j = 0; j < c.squareidx.length; j++){
                    squareVars[j] = Squares[c.squareidx[j]];
                }
                // Apply constraint
                model.allEqual(squareVars).post();
            }
        }

        // 3.2 Squares must have unequal numbers 
        if (unequalsConstraints != null) {
    
            // Loop over all constraints specified 
            for (int i = 0; i < unequalsConstraints.length; i++){
                UnequalsConstraint c = unequalsConstraints[i];

                // Create array of variables needed for the constraint 
                IntVar[] squareVars = new IntVar[c.squareidx.length];
                for (int j = 0; j < c.squareidx.length; j++){
                    squareVars[j] = Squares[c.squareidx[j]];
                }
                // Apply constraint
                model.allDifferent(squareVars).post();
            }
        }

        // 3.2 Numbers of some squares must sum to a certain value 
        if (sumConstraints != null) {

            // Loop over all constraints specified 
            for (int i = 0; i < sumConstraints.length; i++){
                SumConstraint c = sumConstraints[i];

                // Create array of variables needed for the constraint 
                IntVar[] squareVars = new IntVar[c.squareidx.length];
                for (int j = 0; j < c.squareidx.length; j++){
                    squareVars[j] = Squares[c.squareidx[j]];
                }
                // Apply constraint 
                model.sum(squareVars, "=", c.sum).post();
            }
        }

        // 3.3 The number on this square must be smaller than some value
        if (smallerConstraints != null) {

            // Loop over all constraints specified 
            for (int i = 0; i < smallerConstraints.length; i++){
                SmallerConstraint c = smallerConstraints[i];

                // Create array of variables needed for the constraint 
                IntVar[] squareVars = new IntVar[c.squares.length];
                for (int j = 0; j < c.squares.length; j++){
                    squareVars[j] = Squares[c.squares[j]];
                }

                // Apply constraint 
                model.sum(squareVars, "<", c.compareAgaints).post();
            }
        }

        // 3.4 The number on this square must be larger than some value
        if (largerConstraints != null) {
            // Loop over all constraints specified 
            for (int i = 0; i < largerConstraints.length; i++){
                LargerConstraint c = largerConstraints[i];

                // Create array of variables needed for the constraint 
                IntVar[] squareVars = new IntVar[c.squares.length];
                for (int j = 0; j < c.squares.length; j++){
                    squareVars[j] = Squares[c.squares[j]];
                }

                // Apply constraint 
                model.sum(squareVars, ">", c.compareAgaints).post();
            }
        }

        // 4. Return -----------------------------------------------------------
        return model;

    }

}
