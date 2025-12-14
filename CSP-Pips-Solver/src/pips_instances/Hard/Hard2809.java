package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard2809 extends PipsProblem {

    public Hard2809(){

        super(13, 
              new int[][]{{0, 1}, {1, 2}, 
                          {3, 4}, {4, 5}, {5, 6}, {6, 7},
                          {8, 9}, {9, 10}, {10, 11}, {12, 13}, 
                          {19, 20}, {21, 22}, {22, 23}, {23, 24}, {24, 25},
                          {0, 4}, {1, 5}, {2, 6}, 
                          {3, 9}, {4, 10}, {5, 11}, {7, 12}, 
                          {8, 14}, {10, 15}, {13, 16}, 
                          {14, 17}, {15, 18}, {16, 20},
                           {18, 21}, {19, 24}, {20, 25}}, 
              new int[][] {{1, 3}, {5,1}, {6,0}, {0,5}, {0, 0}, 
                           {3, 3}, {0, 4}, {4, 2}, {0, 3}, {1, 1},
                           {0, 1}, {2, 0}, {6, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{8, 14, 17});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(5, new int[]{1, 2});
        SumConstraint b = new SumConstraint(10, new int[]{6, 7});
        SumConstraint c = new SumConstraint(0, new int[]{4, 5, 10});
        SumConstraint d = new SumConstraint(10, new int[]{12, 13});
        SumConstraint e = new SumConstraint(10, new int[]{3, 9});
        SumConstraint f = new SumConstraint(0, new int[]{16, 20, 19, 23, 24});
        SumConstraint g = new SumConstraint(9, new int[]{15, 18, 21});
        return new SumConstraint[]{a, b, c, d, e, f, g};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{11});
        LargerConstraint b = new LargerConstraint(1, new int[]{25});
        return new LargerConstraint[]{a, b};
    }
    
}
