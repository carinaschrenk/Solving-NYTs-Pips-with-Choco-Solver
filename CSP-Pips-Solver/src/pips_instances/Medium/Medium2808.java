package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Medium2808 extends PipsProblem {

    public Medium2808(){

        super(6, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7},
                          {7, 8}, {8, 9}, {9, 10}, {10, 11}, {11, 0}}, 
              new int[][] {{1,6}, {1, 1}, {4, 5}, {6, 4}, {2, 4}, {4, 1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(12, new int[]{1, 2});
        SumConstraint b = new SumConstraint(17, new int[]{7, 8, 9, 10});
        return new SumConstraint[]{a, b};
    }  

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{3, 4, 5, 6});
        return new EqualsConstraint[]{a};
    }
    
}
