package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SmallerConstraint;
import model.LargerConstraint;

public class Medium2309 extends PipsProblem {

    public Medium2309(){

        super(10, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7}, 
                          {8, 9}, 
                          {10, 11}, 
                          {12, 13}, {13, 14}, {14, 15},
                          {16, 17}, {17, 18}, {18, 19},
                          {0, 4}, {1, 5}, {2, 6}, {3, 7},
                          {6, 8}, {7, 9},
                          {8, 10}, {9, 11},
                          {10, 12}, {11, 13},
                          {12, 16}, {13, 17}, {14, 18}, {15, 19}}, 
              new int[][] {{5,0}, {5, 2}, {5,6}, {5,5}, {6,6}, 
                           {6, 1}, {3, 6}, {0, 6}, {6, 2}, {6, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              null, 
              createSmallerConstraints(), createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 2, 3, 5, 6});
        EqualsConstraint b = new EqualsConstraint(new int[]{8, 9, 10, 11, 12, 13, 14, 15});
        return new EqualsConstraint[]{a, b};
    } 

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{16});
        SmallerConstraint b = new SmallerConstraint(1, new int[]{17});
        return new SmallerConstraint[]{a, b};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(1, new int[]{4});
        LargerConstraint b = new LargerConstraint(2, new int[]{7});
        LargerConstraint c = new LargerConstraint(3, new int[]{19});
        return new LargerConstraint[]{a, b, c};
    }
    
}
