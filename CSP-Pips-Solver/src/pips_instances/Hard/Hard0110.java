package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard0110 extends PipsProblem {

    public Hard0110(){

        super(13, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}, 
                          {7, 8},
                          {10, 11}, {11, 12}, {12, 13}, {13, 14}, {14, 15},
                          {16, 17}, {18, 19},
                          {20, 21}, {21, 22}, {22, 23}, {23, 24}, {24, 25},
                          {0, 6}, {2, 7}, {3, 8}, {5, 9},  
                          {6, 10}, {7, 12}, {8, 13}, {9, 15},
                          {10, 16}, {11, 17}, {14, 18}, {15, 19},
                          {16, 20}, {21, 17}, {24, 18}, {25, 19}}, 
              new int[][] {{2, 0}, {2,2}, {0,5}, {1,1}, {0, 1}, 
                           {3, 1}, {6, 1}, {1, 2}, {5, 2}, {0, 4}, 
                           {6, 0}, {0, 3}, {0, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 2, 3, 4, 7, 8});
        EqualsConstraint b = new EqualsConstraint(new int[]{13, 14, 15, 18, 19});
        EqualsConstraint c = new EqualsConstraint(new int[]{22, 23, 24, 25});
        EqualsConstraint d = new EqualsConstraint(new int[]{16, 17});
        return new EqualsConstraint[]{a, b, c, d};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint b = new SumConstraint(10, new int[]{0, 6});
        SumConstraint c = new SumConstraint(0, new int[]{20, 21});
        return new SumConstraint[]{b, c};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(10, new int[]{5, 9});
        return new LargerConstraint[]{a};
    }
    
}
