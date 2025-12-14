package PipsGenerator;

import java.util.*;

public class PlaceAndExtractDominoes {

    /* -------------------------------------------------------------------------
    Given:
    - A board (as a matrix) with numbers on it and a list of possible tilings
    - A Tiling is an array of 8 arrays, specifying row and column values 
        of both ends of the domino as 
        [row_of_end1, column_of_end1, row_of_end2, column_of_end2]
    Output:
    - An array of 8 dominos such that these dominos can cover the board 
    - Each domino is a 2 integer array 
    ------------------------------------------------------------------------- */
    public static int[][] placeAndExtractDominos(int[][] board, int[][][] TILINGS) {
        
        // Choose a random tiling from the given list 
        Random rng = new Random();
        int index = rng.nextInt(TILINGS.length);
        int[][] tiling = TILINGS[index];

        // A Tiling places 8 dominoes, which we want to map to the 
        // numbers from the board.
        int[][] dominos = new int[8][2];

        // Loop over the tiling and extract values 
        for (int i = 0; i < tiling.length; i++) {
            int[] d = tiling[i];
            int[] domino = {board[d[0]][d[1]], board[d[2]][d[3]]};
            dominos[i] = domino;
        }

        return dominos;
    }
}

