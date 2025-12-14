package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;

public class Easy2409 extends PipsProblem {

    public Easy2409(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2,4}, {4,7}, {7,6}, {6,5}, {5,3}, {3,0}}, 
              new int[][]{{2, 2}, {0, 4}, {4, 6}, {5, 2}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint ten = new SumConstraint(10, new int[]{7, 4});
        SumConstraint six = new SumConstraint(6, new int[]{0, 1, 2, 3});
        return new SumConstraint[]{ten, six};
    }
    
}
