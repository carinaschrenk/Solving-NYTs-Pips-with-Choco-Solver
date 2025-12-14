package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard2509 extends PipsProblem {

    public Hard2509(){

        super(10, 
              new int[][]{{0, 1}, {1, 2}, {2, 3},
                          {4, 5}, {5, 6}, {6, 7},
                          {8, 9}, 
                          {10, 11}, 
                          {12, 13}, {13, 14}, {14, 15},
                          {16, 17}, {17, 18}, {18, 19},
                          {0, 4}, {1, 5}, {2, 6}, {3, 7},
                          {4, 8}, {5, 9},  
                          {8, 10}, {9, 11},
                          {10, 12}, {11, 13},
                          {12, 16}, {13, 17}, {14, 18}, {15, 19}}, 
              new int[][] {{5, 3}, {0,3}, {1,1}, {6,6}, {3, 6}, 
                           {3, 2}, {0, 2}, {5, 0}, {0, 0}, {1, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 5, 6, 8, 9});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint b = new SumConstraint(10, new int[]{3, 7});
        SumConstraint c = new SumConstraint(8, new int[]{10, 12});
        SumConstraint d = new SumConstraint(2, new int[]{11, 13});
        SumConstraint e = new SumConstraint(7, new int[]{14, 15});
        SumConstraint f = new SumConstraint(6, new int[]{18, 19});
        return new SumConstraint[]{b, c, d, e, f};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(1, new int[]{0});
        return new LargerConstraint[]{a};
    }
    
}
