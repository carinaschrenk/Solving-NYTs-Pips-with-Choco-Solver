package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;

public class Easy0710 extends PipsProblem {

    public Easy0710(){

        super(6, 
              new int[][] {{0,1}, {1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}, {7, 0},
                           {4, 8}, 
                           {8,9}, {9,10}, {10,11}}, 
              new int[][]{{3,3}, {0, 4}, {5, 5}, {4, 4}, {2, 3}, {5, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(16, new int[]{3, 4, 5, 8});
        SumConstraint b = new SumConstraint(9, new int[]{0, 7, 6});
        SumConstraint c = new SumConstraint(15, new int[]{11, 10, 9});
        return new SumConstraint[]{a, b, c};
    }
    
}
