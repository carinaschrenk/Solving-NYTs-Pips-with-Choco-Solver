package PipsGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import model.EqualsConstraint;
import model.SumConstraint;
import model.PipsProblem;

public class GeneratePipsInstance {

    int[][] board;
    int boardSize;

    public PipsProblem makeCustomProblem(String boardType, String constraintType){

        int[][] board;
        int[][] adjacency;
        int[][][] tilings;

        // Get the board layout 
        if (boardType == "L"){
            board = BoardGenerator.getLBoard();
            adjacency = BoardGenerator.getLAdjacency();
            tilings = Tilings.LTILINGS;
            this.boardSize = 6;
        }
        else if (boardType == "Staircase"){
            board = BoardGenerator.getStaircaseBoard();
            adjacency = BoardGenerator.getStaircaseAdjacency();
            tilings = Tilings.STAIRCASETILINGS;
            this.boardSize = 6;
        }
        else if (boardType == "Square"){
            board = BoardGenerator.getSquareBoard();
            adjacency = BoardGenerator.getSquareAdjacency();
            tilings = Tilings.SQUARETILINGS;
            this.boardSize = 4;
        }
        else{
            System.err.println("I dont know this board type.");
            return null;
        }

        // For the sum and equals constraints we need regions
        // Places the numbers 1-4 as regionIDs on the board
        // region1 has 5 cells, region2 has 4...
        if (constraintType == "Sum" | constraintType == "Equals"){
            RegionGenerator regionGenerator = new RegionGenerator();
            this.board = regionGenerator.generateRegions(board, this.boardSize);
        }
        else {
            this.board = board;
        }

        // Place numbers on this board and get corresponding constraint array 
        EqualsConstraint[] eConstraints = null;
        SumConstraint[] sConstraints = null;
        if (constraintType == "Equals"){
            eConstraints = placeNumbersEquals(boardType);
        }
        else if (constraintType == "Sum"){
            sConstraints = placeNumbersSum(boardType);
        }
        else if (constraintType == "Single"){
            sConstraints = placeNumbersSingle(boardType);
        }
        else{
            System.err.println("Don't know this constraint Type");
            return null;
        }

        // Select a random tiling and extract dominoes 
        int[][] dominos = PlaceAndExtractDominoes.placeAndExtractDominos(this.board, tilings);

        // Create the final problem 
        PipsProblem newproblem = null;
        if (constraintType == "Equals"){
            newproblem = new PipsProblem(8, adjacency, dominos, 
                                        new int[]{0, 1, 2, 3, 4, 5, 6}, 
                                        eConstraints, null, null, null, null);
        }
        else if (constraintType == "Sum"){
            newproblem = new PipsProblem(8, adjacency, dominos, 
                                        new int[]{0, 1, 2, 3, 4, 5, 6}, 
                                        null, null, sConstraints, null, null);

        }
        else if (constraintType == "Single"){
            newproblem = new PipsProblem(8, adjacency, dominos, 
                                        new int[]{0, 1, 2, 3, 4, 5, 6}, 
                                        null, null, sConstraints, null, null);

        }

        // Print board + dominoes 
        System.out.println("The Board:");
        Utilities.printBoard(this.board);
        System.out.println("The Dominoes:");
        for (int[] d : dominos){
            System.out.println("[" + d[0] + " | " + d[1] + "]");
        }

        return newproblem;

    }

    /* -------------------------------------------------------------------------
    Given: 
    - The boardtype
    Returns: 
    - An array of equals constraints

    Places values between 0 and 6 on the board, such that each region 
    becomes an equals constraint
    Translates row, column index pairs to a squareID, to store them in the constraint
    ------------------------------------------------------------------------- */
    public EqualsConstraint[] placeNumbersEquals(String boardType){


        // 1. Get correct translator 
        Map<String, Integer> translate;
        if (boardType == "L"){
            translate = BoardGenerator.getLMap();
        }
        else if (boardType == "Staircase"){
            translate = BoardGenerator.getStaircaseMap();
        }
        else {
            translate = BoardGenerator.getSquareMap();
        }

        // 2. Generate 4 random numbers (for regions 1–4) (map[0] not used)
        // Use a shuffled collection to ensure each number is used once
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers, rand);

        int[] map = new int[5];  
        for (int i = 1; i <= 4; i++) {
            map[i] = numbers.get(i-1); 
        }

        // 3. Remember which cells on the board belong to one region
        // (already translate to squareID)
        Map<Integer, List<Integer>> regions = new HashMap<>();

        for (int r = 0; r < this.boardSize; r++) {
            for (int c = 0; c < this.boardSize; c++) {

                int negativeRegionID = this.board[r][c];
                if (negativeRegionID >= -4 && negativeRegionID <= -1) {
                    regions.putIfAbsent(negativeRegionID, new ArrayList<>());
                    regions.get(negativeRegionID).add(translate.get(r + "," + c));  
                }
            }
        } 

        // 4. Fill array of constraints 
        EqualsConstraint[] result = new EqualsConstraint[4];  

        // Loop through the regions and convert to equals constraint
        for (Map.Entry<Integer, List<Integer>> entry : regions.entrySet()) {
            Integer regionId = -entry.getKey();
            List<Integer> squareIds = entry.getValue();
            System.out.println("SquareIds of Constraint: " + squareIds);

            result[regionId-1] = new EqualsConstraint(squareIds.stream().mapToInt(Integer::intValue).toArray());
        }

        // 5. Replace the values in the matrix
        for (int r = 0; r < this.boardSize; r++) {
            for (int c = 0; c < this.boardSize; c++) {
                int negativeRegionID = this.board[r][c];

                // For the regions use the map computed in step 2
                if (negativeRegionID >= -4 && negativeRegionID <= -1) {
                    this.board[r][c] = map[-negativeRegionID];
                }
                // For parts of the board that are not part of a region use an 
                // unused number from the random collection
                else if (this.board[r][c] == 0 ) {
                    this.board[r][c] = numbers.get(5); 
                }
            }
        }

        return result;

    }

    /* -------------------------------------------------------------------------
    Given: 
    - The boardtype
    Returns: 
    - An array of 4 sum constraints

    Places values between 0 and 6 on the board, such that each region 
    becomes a sum constraint
    Translates row, column index pairs to a squareID, to store them in the constraint
    ------------------------------------------------------------------------- */
    public SumConstraint[] placeNumbersSum(String boardType){

        SumConstraint[] result = new SumConstraint[4];  
        Random rand = new Random();

        // 1. Get correct translator 
        Map<String, Integer> translate;
        if (boardType == "L"){
            translate = BoardGenerator.getLMap();
        }
        else if (boardType == "Staircase"){
            translate = BoardGenerator.getStaircaseMap();
        }
        else {
            translate = BoardGenerator.getSquareMap();
        }

        // 2. Loop over the board 4 times
        // For each constraintID, find the region of the same ID, 
        // collect the squareIds and place random numbers 
        for (int constraintID = 1; constraintID <= 4; constraintID++){

            // Collect the target value by adding up the randomly assigned numbers
            int sum = 0;
            int counter = 0;

            // Collect the squareIDs of the constraint
            // region1 has size 5, region2 has size 4...
            int[] squareIDs = new int[6 - constraintID];

            // Loop over the board 
            for (int r = 0; r < this.boardSize; r++){
                for (int c = 0; c < this.boardSize; c++){

                    // Found the current region
                    if (this.board[r][c] == -constraintID){

                        // Assign a random value between 0 and 6, and add it to the sum
                        this.board[r][c] = rand.nextInt(7);
                        sum = sum + this.board[r][c];

                        // Determine the squareID using the translator
                        int squareID = translate.get(r + "," + c);
                        squareIDs[counter] = squareID;
                        counter++;

                    }
                }
            }

            // Now we can build the final constraint
            System.out.println("Target value: " + sum + ", SquareIDs: " + Arrays.toString(squareIDs));
            result[constraintID-1] = new SumConstraint(sum, squareIDs);

        }
        return result;
    }

    /* -------------------------------------------------------------------------
    Given: 
    - The boardtype
    Returns: 
    - An array of 14 sum constraints

    Places values between 0 and 6 on the board, such that each region 
    becomes a sum constraint
    Translates row, column index pairs to a squareID, to store them in the constraint
    ------------------------------------------------------------------------- */
    public SumConstraint[] placeNumbersSingle(String boardType){

        SumConstraint[] result = new SumConstraint[14];  
        Random rand = new Random();

        // 1. Get correct translator 
        Map<String, Integer> translate;
        if (boardType == "L"){
            translate = BoardGenerator.getLMap();
        }
        else if (boardType == "Staircase"){
            translate = BoardGenerator.getStaircaseMap();
        }
        else {
            translate = BoardGenerator.getSquareMap();
        }

        // 2. Determine the two squares to skip 
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers, rand);
        int skip1 = numbers.get(0);
        int skip2 = numbers.get(1);

        // 3. Loop over the board 
        // Convert cells to squareIds and place random numbers 
        // For each cell except the two we skip, create a sum constraint
        int counter = 0;

        // Loop over the board 
        for (int r = 0; r < this.boardSize; r++){
            for (int c = 0; c < this.boardSize; c++){

                // Check whether it is part of the board!! 
                if (this.board[r][c] != -10){

                    // Determine the squareID using the translator
                    int squareID = translate.get(r + "," + c);

                    // Do we skip?
                    if (squareID != skip1 && squareID != skip2){

                        // Assign a random value between 0 and 6...
                        int single = rand.nextInt(7);
                        this.board[r][c] = single;
                    
                        // .. and build the constraint
                        System.out.println("Target value: " + single + ", SquareID: " + squareID);
                        result[counter] = new SumConstraint(single, new int[]{squareID});
                        counter++;
                    }
                }
            }
        }

        return result;

    }
    
}
