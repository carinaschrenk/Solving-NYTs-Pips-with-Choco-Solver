package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.LargerConstraint;
import model.SumConstraint;

public class Medium2408 extends PipsProblem {

    public Medium2408(){

        super(7, 
              new int[][]{{0, 1}, {2, 3}, {4, 5}, {6, 7},
                          {7, 8}, {8, 9}, {9, 10}, {11, 12}, {12, 13}, 
                          {3, 5}, {4, 9}, {10, 13}}, 
              new int[][] {{4,1}, {2,0}, {3, 4}, {4, 2}, {0, 1}, {3, 2}, {0, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{12, 13});
        return new EqualsConstraint[]{a}; 
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{11});
        SumConstraint b = new SumConstraint(1, new int[]{0});
        SumConstraint c = new SumConstraint(0, new int[]{7, 8});
        SumConstraint d = new SumConstraint(16, new int[]{1, 2, 4, 9});
        return new SumConstraint[]{a, b, c, d};
    }  

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(2, new int[]{3});
        return new LargerConstraint[]{a};
    }
    
}
