package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;

public class Easy0410 extends PipsProblem {

    public Easy0410(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}}, 
              new int[][]{{3,4}, {1, 6}, {3, 6}, {4, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(8, new int[]{1,2});
        SumConstraint b = new SumConstraint(9, new int[]{3,4});
        SumConstraint c = new SumConstraint(7, new int[]{5,6});
        return new SumConstraint[]{a, b, c};
    }
    
}
