package pips_instances.Hard;

import model.PipsProblem;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard2408 extends PipsProblem {

    public Hard2408(){

        super(10, 
              new int[][]{{0, 1}, {2, 3}, 
                           {4, 5}, {6, 7}, 
                           {9, 8}, {10, 9}, {10, 11}, {11, 12}, {12, 13}, 
                           {14, 15}, {15, 16}, {16, 17}, {17, 18}, {18, 19},
                           {0, 4}, {1, 5}, {2, 6}, {3, 7},
                           {4, 8}, {5, 9}, {6, 12}, {7, 13},
                           {8, 14}, {9, 15}, {10, 16}, {11, 17}, {12, 18}, {13, 19}},
              new int[][] {{2, 6}, {6,5}, {4,6}, {6,0}, {0, 3}, 
                           {4, 3}, {5, 5}, {6, 1}, {0, 1}, {6, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), createSmallerConstraints(),
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 5, 9, 10, 11, 12, 6});
        EqualsConstraint b = new EqualsConstraint(new int[]{8, 14});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{16, 17});
        SumConstraint b = new SumConstraint(0, new int[]{13, 19});
        SumConstraint c = new SumConstraint(2, new int[]{3, 7});
        return new SumConstraint[]{a, b, c};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{2});
        SmallerConstraint b = new SmallerConstraint(3, new int[]{0});
        return new SmallerConstraint[]{a, b};
    }
    
}
