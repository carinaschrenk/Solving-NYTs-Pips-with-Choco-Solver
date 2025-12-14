package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;
import model.SmallerConstraint;
import model.LargerConstraint;

public class Hard2309 extends PipsProblem {

    public Hard2309(){

        super(8, 
              new int[][]{{1, 2}, 
                          {4, 5},
                          {6, 7}, {7, 8},
                          {9, 10}, {11, 10},
                          {13,12}, {13,14},
                          {0, 1}, 
                          {2, 3}, 
                          {3, 6}, {4, 8}, 
                          {6, 9}, {7, 10}, {8, 11}, 
                          {10, 12}, {11, 13}, 
                          {14,15}},
              new int[][] {{4,0}, {0,3}, {3,1}, {1,2}, {1,6}, {0,1}, {2,3}, {3,3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(),
               createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{7, 9, 10, 11, 12});
        return new EqualsConstraint[]{a};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(2, new int[]{1, 2});
        SumConstraint b = new SumConstraint(2, new int[]{3, 6});
        SumConstraint c = new SumConstraint(2, new int[]{4, 8});
        SumConstraint d = new SumConstraint(2, new int[]{13, 14});
        
        return new SumConstraint[]{a, b, c, d};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[] {15});
        return new SmallerConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(2, new int[] {5});
        return new LargerConstraint[]{a};
    }
    
}
