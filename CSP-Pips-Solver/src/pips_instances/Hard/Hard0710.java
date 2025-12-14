package pips_instances.Hard;

import model.PipsProblem;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard0710 extends PipsProblem {

    public Hard0710(){

        super(10, 
              new int[][]{{0, 1}, 
                          {2, 3}, {4, 5}, 
                          {9, 8}, {10, 11}, {11, 12},
                          {14, 15}, {15, 16}, {17, 18}, {18, 19},
                          {0, 2}, {1, 3}, 
                          {2, 6}, {5, 7},
                          {6, 8}, {7, 13}, 
                          {9, 14}, {10, 16}, {12, 17}, {13, 19}},
              new int[][] {{1, 6}, {3, 0}, {4, 2}, {2, 0}, {6, 6}, 
                           {4, 4}, {2, 5}, {0, 0}, {3, 2}, {5, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), createSmallerConstraints(),
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{8, 9});
        EqualsConstraint b = new EqualsConstraint(new int[]{11, 12});
        EqualsConstraint c = new EqualsConstraint(new int[]{5, 7, 13});
        return new EqualsConstraint[]{a, b, c};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{0, 1});
        SumConstraint b = new SumConstraint(11, new int[]{2, 3, 6});
        SumConstraint c = new SumConstraint(5, new int[]{14, 15});
        SumConstraint d = new SumConstraint(7, new int[]{10, 16});
        SumConstraint e = new SumConstraint(11, new int[]{17, 18, 19});
        return new SumConstraint[]{a, b, c, d, e};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{4});
        return new SmallerConstraint[]{a};
    }
    
}
