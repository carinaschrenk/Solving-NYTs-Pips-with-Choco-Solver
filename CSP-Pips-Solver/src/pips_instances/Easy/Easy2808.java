package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.EqualsConstraint;

public class Easy2808 extends PipsProblem {

    public Easy2808(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2, 3}, {3,4}, {4,5}, {5,6}, {6,7}}, 
              new int[][]{{4, 4}, {5, 1}, {5, 5}, {2, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint seventeen = new SumConstraint(17, new int[]{3, 4, 5, 6});
        return new SumConstraint[]{seventeen};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1, 2});
        return new EqualsConstraint[]{a};
    }
    
}
