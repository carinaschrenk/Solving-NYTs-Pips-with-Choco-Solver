package pips_instances.Hard;

import model.PipsProblem;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard0510 extends PipsProblem {

    public Hard0510(){

        super(9, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                           {4, 5}, {5, 6}, {6, 7}, 
                           {9, 8}, {10, 11},
                           {14, 15}, {15, 16}, {16, 17}, 
                           {0, 4}, {1, 5}, {2, 6}, {3, 7}, 
                           {4, 9}, {7, 10}, 
                           {9, 12}, {10, 13}, 
                           {12, 14}, {13, 17}},
              new int[][] {{3, 6}, {4,3}, {2,3}, {4,0}, {5, 4}, 
                           {3, 3}, {2, 5}, {4, 4}, {5, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), createSmallerConstraints(),
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1, 4, 5});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(8, new int[]{10, 13});
        SumConstraint b = new SumConstraint(8, new int[]{15, 16, 17});
        SumConstraint c = new SumConstraint(9, new int[]{2, 3, 7});
        return new SumConstraint[]{a, b, c};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(2, new int[]{11});
        return new LargerConstraint[]{a};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(7, new int[]{9, 12});
        SmallerConstraint b = new SmallerConstraint(6, new int[]{14});
        return new SmallerConstraint[]{a, b};
    }
    
}
