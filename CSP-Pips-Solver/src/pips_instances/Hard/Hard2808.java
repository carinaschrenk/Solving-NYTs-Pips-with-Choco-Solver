package pips_instances.Hard;

import model.PipsProblem;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard2808 extends PipsProblem {

    public Hard2808(){

        super(10, 
              new int[][]{{0, 1}, {2, 3}, 
                           {4, 6}, {5, 8}, {6, 7}, {7, 8}, {7, 9},
                           {10, 11}, {11, 12}, {12, 13}, {13, 14},
                           {14, 15}, {15, 16}, {16, 17}, {17, 18}, {14, 19}},
              new int[][] {{6, 6}, {4,5}, {1,0}, {1,1}, {5, 1}, 
                           {2, 6}, {3, 0}, {2, 0}, {2, 3}, {0, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), createSmallerConstraints(),
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(17, new int[]{4, 6, 7});
        SumConstraint b = new SumConstraint(1, new int[]{9});
        SumConstraint c = new SumConstraint(9, new int[]{5, 8});
        SumConstraint d = new SumConstraint(7, new int[]{12, 13, 14, 15});
        SumConstraint e = new SumConstraint(6, new int[]{16});
        SumConstraint f = new SumConstraint(0, new int[]{17, 18});
        SumConstraint g = new SumConstraint(0, new int[]{19});
        return new SumConstraint[]{a, b, c, d, e, f, g};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(1, new int[]{2});
        return new LargerConstraint[]{a};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{10, 11});
        return new SmallerConstraint[]{a};
    }
    
}
