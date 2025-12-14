package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Medium2608 extends PipsProblem {

    public Medium2608(){

        super(7, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7},
                          {4, 8}, {8, 9}, {9, 10}, {10, 11}, {11, 12}, {12, 13}}, 
              new int[][] {{3, 5}, {2, 6}, {3, 0}, {5, 1}, {2, 2}, {4, 6}, {4, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{1, 2});
        SumConstraint b = new SumConstraint(1, new int[]{3, 4});
        SumConstraint c = new SumConstraint(12, new int[]{9, 10});
        SumConstraint d = new SumConstraint(8, new int[]{11, 12});
        return new SumConstraint[]{a, b, c, d};
    }  

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{6, 7});
        return new EqualsConstraint[]{a};
    }
    
}
