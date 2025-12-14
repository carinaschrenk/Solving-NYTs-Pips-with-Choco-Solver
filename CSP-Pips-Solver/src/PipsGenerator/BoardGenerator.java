package PipsGenerator;

import java.util.HashMap;
import java.util.Map;

public class BoardGenerator {

    /* -------------------------------------------------------------------------
    The L board has exactly one way to be tiled
    It consists of two L shapes of size 8
    Returns: 
    - A 6x6 matrix of integers
    ------------------------------------------------------------------------- */
    public static int[][] getLBoard(){

        int[][] board = new int[6][6];

        board[0][5] = -10;
        board[4][0] = -10;
        board[5][0] = -10;
        board[5][1] = -10;
        board[5][2] = -10;
        board[5][3] = -10;
        board[5][4] = -10;
        board[5][5] = -10;

        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 5; j++){
                board[i][j] = -10;
            }
        }

        return board; 
    }

    public static int[][] getLAdjacency(){
        int[][] adjacency = new int[][]{
            {0, 1}, {1, 2}, {2, 3}, {3, 4}, 
            {0, 5}, {5, 6}, {6, 7}, {8, 9}, {9, 10}, {10, 11},
            {12, 13}, {13, 14}, {14, 15}, {15, 11}
        };

        return adjacency;
    }

    public static Map<String, Integer> getLMap(){

        Map<String, Integer> map = new HashMap<>();

        map.put(0 + "," + 0, 0);
        map.put(0 + "," + 1, 1);
        map.put(0 + "," + 2, 2);
        map.put(0 + "," + 3, 3);
        map.put(0 + "," + 4, 4);
        map.put(1 + "," + 0, 5);
        map.put(2 + "," + 0, 6);
        map.put(3 + "," + 0, 7);
        map.put(1 + "," + 5, 8);
        map.put(2 + "," + 5, 9);
        map.put(3 + "," + 5, 10);
        map.put(4 + "," + 5, 11);
        map.put(4 + "," + 1, 12);
        map.put(4 + "," + 2, 13);
        map.put(4 + "," + 3, 14);
        map.put(4 + "," + 4, 15);

        return map;
    }

    /* -------------------------------------------------------------------------
    The staircase board has exactly 17 ways to be tiled 
    Returns: 
    - A 6x6 matrix of integers
    ------------------------------------------------------------------------- */
    public static int[][] getStaircaseBoard(){

        int[][] board = new int[6][6];

        for (int i = 0; i < 2; i++){
            for (int j = 1; j < 6; j++){
                board[i][j] = -10;
            }
        }

        for (int i = 2; i < 4; i++){
            for (int j = 2; j < 6; j++){
                board[i][j] = -10;
            }
        }
       
        board[4][5] = -10;
        board[5][5] = -10;

        return board;
    }

    public static int[][] getStaircaseAdjacency(){
        int[][] adjacency = new int[][]{
            {0, 1}, {1, 2}, {2, 3}, 
            {4, 5}, 
            {6, 7}, {7, 8}, {8, 9}, {9, 10}, 
            {11, 12}, {12, 13}, {13, 14}, {14, 15},
            {2, 4}, {3, 5}, 
            {4, 6}, {5, 7}, 
            {6, 11}, {7, 12}, {8, 13}, {9, 14}, {10, 15}
        };

        return adjacency;
    }

    public static Map<String, Integer> getStaircaseMap(){

        Map<String, Integer> map = new HashMap<>();

        map.put(0 + "," + 0, 0);
        map.put(1 + "," + 0, 1);
        map.put(2 + "," + 0, 2);
        map.put(2 + "," + 1, 3);
        map.put(3 + "," + 0, 4);
        map.put(3 + "," + 1, 5);
        map.put(4 + "," + 0, 6);
        map.put(4 + "," + 1, 7);
        map.put(4 + "," + 2, 8);
        map.put(4 + "," + 3, 9);
        map.put(4 + "," + 4, 10);
        map.put(5 + "," + 0, 11);
        map.put(5 + "," + 1, 12);
        map.put(5 + "," + 2, 13);
        map.put(5 + "," + 3, 14);
        map.put(5 + "," + 4, 15);

        return map;
    }

    /* -------------------------------------------------------------------------
    The squre board has exactly 36 ways to be tiled
    Returns: 
    - A 4x4 matrix of integers
    ------------------------------------------------------------------------- */
    public static int[][] getSquareBoard(){

        int[][] board = new int[4][4];

        return board;
    }

    public static int[][] getSquareAdjacency(){
        int[][] adjacency = new int[][]{
            {0, 1}, {1, 2}, {2, 3}, 
            {4, 5}, {5, 6}, {6, 7},
            {8, 9}, {9, 10}, {10, 11},
            {12, 13}, {13, 14}, {14, 15},
            {0, 4}, {1, 5}, {2, 6}, {3, 7},
            {4, 8}, {5, 9}, {6, 10}, {7, 11}, 
            {8, 12}, {9, 13}, {10, 14}, {11, 15}
        };

        return adjacency;
    }

    public static Map<String, Integer> getSquareMap(){

        Map<String, Integer> map = new HashMap<>();

        map.put(0 + "," + 0, 0);
        map.put(0 + "," + 1, 1);
        map.put(0 + "," + 2, 2);
        map.put(0 + "," + 3, 3);
        map.put(1 + "," + 0, 4);
        map.put(1 + "," + 1, 5);
        map.put(1 + "," + 2, 6);
        map.put(1 + "," + 3, 7);
        map.put(2 + "," + 0, 8);
        map.put(2 + "," + 1, 9);
        map.put(2 + "," + 2, 10);
        map.put(2 + "," + 3, 11);
        map.put(3 + "," + 0, 12);
        map.put(3 + "," + 1, 13);
        map.put(3 + "," + 2, 14);
        map.put(3 + "," + 3, 15);

        return map;
    }
    
}
