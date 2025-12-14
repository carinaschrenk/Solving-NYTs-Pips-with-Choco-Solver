package PipsGenerator;

import java.util.*;

public class RegionGenerator {

    // Directions of movements
    static final int[][] DIRS = {{1,0},{-1,0},{0,1},{0,-1}};

    // Input will be copied into "global" variables 
    int[][] grid;
    int gridSize;

    /* -------------------------------------------------------------------------
    Main Function
    Generates 4 regions of sizes (5, 4, 3 and 2)
    Input:  A square board as a matrix of integers: 
            - Cells that may not be used as regions have to be set to -10
            - Otherwise they are zero
    Returns:    A square of same size, where regions 1-4 were placed 
                as entries -1, -2, -3 and -4 in the matrix.
                Region1 has 5 cells, region2 has 4 ...
    ------------------------------------------------------------------------- */
    public int[][] generateRegions(int[][] board, int gridSize) {  
        
        // Make a copy of input 
        this.gridSize = gridSize; 
        this.grid = new int[gridSize][gridSize];
        for (int i = 0; i < gridSize; i++){
            System.arraycopy(board[i], 0, this.grid[i], 0, gridSize);
        }

        // Start with region 1, recursively adds more  
        if (!placeRegions(new int[]{5, 4, 3, 2}, 1)){
            System.out.println("Something went wrong");
        }

        return this.grid;
    }

    /* Helpers -------------------------------------------------------------- */

    /* -------------------------------------------------------------------------
    Places regions of the sizes specicied in "sizes" 
    Currently works on the region with ID "regionID" 
    Depending on whether it was sucessful returns true or false 
    ------------------------------------------------------------------------- */
    boolean placeRegions(int[] sizes, Integer regionId) {

        // Placed all regions, we can return 
        if (regionId > sizes.length) return true;

        // Determine size of to be placed region 
        int size = sizes[regionId - 1];

        // Create random shuffle of unassigned cells
        List<int[]> startCells = Utilities.allEmptyCells(this.grid, this.gridSize);
        Collections.shuffle(startCells);

        // Pick a still unassigned cell, and start from here
        for (int[] cell : startCells) {
            int r = cell[0], c = cell[1];

            // Create a new region (with ID regionID)
            List<int[]> region = new ArrayList<>();
            region.add(cell);
            grid[r][c] = -regionId;

            // Try to expand the region, if it fails clear and try again
            if (expandRegion(region, size, regionId)) {
                if (placeRegions(sizes, regionId + 1)) return true;
            }
            else{ 
                clearRegion(regionId);
            }
        }

        // Could not create a region, board is too small/topology does not work
        return false;
    }

    /* -------------------------------------------------------------------------
    Tries to expand the current "region" marked in the matrix as "id" 
    until it has the desired "size" 
    ------------------------------------------------------------------------- */
    boolean expandRegion(List<int[]> region, int size, int regionId) {
        
        if (region.size() == size) return true;

        List<int[]> frontier = new ArrayList<>();
        boolean[][] seen = new boolean[this.gridSize][this.gridSize];

        // Build frontier from region cells (aka all cells that are neighbors to the region)
        for (int[] cell : region) {
            for (int[] d : DIRS) {
                int nr = cell[0] + d[0], nc = cell[1] + d[1];
                if (inBounds(nr, nc) && grid[nr][nc] == 0 && !seen[nr][nc]) {
                    seen[nr][nc] = true;
                    frontier.add(new int[]{nr, nc});
                }
            }
        }

        // Randomize 
        Collections.shuffle(frontier);

        // Assign a new cell and recursively keep expanding
        for (int[] f : frontier) {
            int r = f[0], c = f[1];
            grid[r][c] = -regionId;
            region.add(f);

            // Recursion suceeded, we can return 
            if (expandRegion(region, size, regionId)){
                return true;
            }
            // Could not finish assigning the region, undo previous step
            else {
                region.remove(region.size() - 1);
                grid[r][c] = 0;
            }
        }

        return false;
    }

    /* -------------------------------------------------------------------------
    Sets all values in grid to zero that currently have the value "id" 
    ------------------------------------------------------------------------- */
    void clearRegion(int regionId) {

        for (int r = 0; r < this.gridSize; r++){
            for (int c = 0; c < this.gridSize; c++){
                if (this.grid[r][c] == -regionId){
                    this.grid[r][c] = 0;
                }
            }
        }
    } 

    /* -------------------------------------------------------------------------
    Returns wether the cell [r][c] is part of the board
    ------------------------------------------------------------------------- */
    boolean inBounds(int r, int c) {
        return r >= 0 && r < this.gridSize && c >= 0 && c < this.gridSize;
    }

}
