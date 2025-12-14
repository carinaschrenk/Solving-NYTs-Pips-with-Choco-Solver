package pips_instances.Medium;

import model.PipsProblem;
import model.SumConstraint;

public class Medium2609 extends PipsProblem {

    public Medium2609(){

        super(7, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},
                          {8, 9}, {9, 10}, 
                          {11, 12}, {12, 13},
                          {0, 5}, {1, 6}, {2, 7}, 
                          {5, 8}, {6, 9}, {7, 10},
                          {8, 11}, {9, 12}, {10, 13}}, 
              new int[][] {{5, 5}, {5, 6}, {3, 4}, {2, 4}, {1, 6}, 
                           {1, 5}, {0, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(15, new int[]{1, 2, 3});
        SumConstraint b = new SumConstraint(6, new int[]{0});
        SumConstraint c = new SumConstraint(9, new int[]{5, 6});
        SumConstraint d = new SumConstraint(3, new int[]{7, 10});
        SumConstraint e = new SumConstraint(10, new int[]{8, 9});
        SumConstraint f = new SumConstraint(1, new int[]{11, 12});
        SumConstraint g = new SumConstraint(0, new int[]{13});
        return new SumConstraint[]{a, b, c, d, e, f, g};
    }  
    
}
