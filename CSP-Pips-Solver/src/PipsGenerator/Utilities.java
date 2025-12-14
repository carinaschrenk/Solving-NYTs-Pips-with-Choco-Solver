package PipsGenerator;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

    /* ------------------------------------------------------------------------
    Input: 
    - A square grid of integers as a matrix
    - Size of the grid (side length)
    Output:
    - List of all empty cells on the grid (cells that have value 0)
    - List contains arrays [row, column] 
    ------------------------------------------------------------------------ */
    static public List<int[]> allEmptyCells(int[][] grid, int gridSize) {

        // New empty list 
        List<int[]> list = new ArrayList<>();

        // Loop over board an collect empty cells 
        for (int r = 0; r < gridSize; r++){
            for (int c = 0; c < gridSize; c++){
                if (grid[r][c] == 0){
                    list.add(new int[]{r, c});
                }
            }
        }
        return list;
    }

    /* -------------------------------------------------------------------------
    Prints the matrix "board" 
    ------------------------------------------------------------------------- */ 
    static public void printBoard(int[][] board) {

        // Loop trough all rows and print the values 
        for (int[] row : board) {
            for (int value : row){
                if (value == -10){
                    System.out.print(value + " ");
                }
                else {
                    System.out.print("  " + value + " ");
                }
            }
            System.out.println();
        }
    }
    
}
