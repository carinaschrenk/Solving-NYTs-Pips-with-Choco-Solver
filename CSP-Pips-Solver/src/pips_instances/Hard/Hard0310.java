package pips_instances.Hard;

import model.PipsProblem;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard0310 extends PipsProblem {

    public Hard0310(){

        super(12, 
              new int[][]{{2, 3}, {3, 4},
                           {5, 6}, {6, 7}, {7, 8}, 
                           {9, 10}, {10, 11}, 
                           {12, 13}, {13, 14}, {14, 15}, {15, 16}, {16, 17}, {17, 18}, {18, 19},
                           {20, 21}, {21, 22}, {22, 23},
                           {0, 5}, {1, 8}, {2, 9}, {3, 10}, {4, 11}, 
                           {5, 12}, {6, 13}, {7, 14}, {8, 15}, {9, 17}, {10, 18}, {11, 19}},
              new int[][] {{4, 3}, {2,1}, {6,4}, {1,5}, {2,2}, 
                           {0, 1}, {6, 5}, {1, 1}, {5, 3}, {0, 2}, 
                           {6, 2}, {3, 2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), createSmallerConstraints(),
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{4, 11});
        EqualsConstraint b = new EqualsConstraint(new int[]{2, 3, 9, 17, 18});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(3, new int[]{14, 15, 16});
        SumConstraint b = new SumConstraint(7, new int[]{6, 13});
        return new SumConstraint[]{a, b};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(11, new int[]{5, 12});
        LargerConstraint b = new LargerConstraint(9, new int[]{21, 22});
        return new LargerConstraint[]{a, b};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(5, new int[]{10});
        SmallerConstraint b = new SmallerConstraint(1, new int[]{7, 8});
        SmallerConstraint c = new SmallerConstraint(3, new int[]{23});
        return new SmallerConstraint[]{a, b, c};
    }
    
}
