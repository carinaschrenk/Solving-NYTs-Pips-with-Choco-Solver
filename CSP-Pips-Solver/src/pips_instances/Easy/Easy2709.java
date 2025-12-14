package pips_instances.Easy;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Easy2709 extends PipsProblem {

    public Easy2709(){

        super(4, 
              new int[][] {{0,2}, {1,2}, {3, 4}, {5, 6}, 
                           {1, 3}, {2, 4}, {3, 5}, {4, 6}, {5, 7}}, 
              new int[][]{{6, 1}, {3, 4}, {2, 2}, {1, 1}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(6, new int[]{1, 2});
        SumConstraint b = new SumConstraint(4, new int[]{3, 5});
        return new SumConstraint[]{a, b};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{4, 6});
        return new EqualsConstraint[]{a};
    }

}
