package pips_instances.Medium;

import model.PipsProblem;
import model.SumConstraint;

public class Medium2908 extends PipsProblem {

    public Medium2908(){

        super(6, 
              new int[][]{{0, 1}, {1, 2}, {3, 4}, {4, 5}, {5, 6}, {6, 7},
                          {7, 8}, {9, 10}, {10, 11}, {0, 5}, {1, 6},
                          {2, 7}, {4, 9}, {5, 10}, {6, 11}}, 
              new int[][] {{2,0}, {0,6}, {0,4}, {2,6}, {4, 5}, {2, 2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{10, 11});
        SumConstraint b = new SumConstraint(4, new int[]{2, 7, 8});
        SumConstraint c = new SumConstraint(4, new int[]{5, 6});
        SumConstraint d = new SumConstraint(8, new int[]{4, 9});
        SumConstraint e = new SumConstraint(12, new int[]{0, 1});
        return new SumConstraint[]{a, b, c, d, e};
    }  
    
}
