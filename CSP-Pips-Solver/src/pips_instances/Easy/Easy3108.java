package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.EqualsConstraint;

public class Easy3108 extends PipsProblem {

    public Easy3108(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}}, 
              new int[][]{{2, 1}, {5, 6}, {1, 0}, {5, 2}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint ten = new SumConstraint(10, new int[]{5, 6});
        return new SumConstraint[]{ten};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 2});
        EqualsConstraint b = new EqualsConstraint(new int[]{3, 4});
        return new EqualsConstraint[]{a, b};
    }
    
}
