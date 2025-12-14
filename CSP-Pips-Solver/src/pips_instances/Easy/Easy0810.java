package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;

public class Easy0810 extends PipsProblem {

    public Easy0810(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}}, 
              new int[][]{{3,6}, {3, 4}, {0, 0}, {1, 0}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{0,1,2});
        SumConstraint b = new SumConstraint(11, new int[]{3,4, 5, 6});
        SumConstraint c = new SumConstraint(6, new int[]{7});
        return new SumConstraint[]{a, b, c};
    }
    
}
