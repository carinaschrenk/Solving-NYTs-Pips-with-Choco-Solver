package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.EqualsConstraint;

public class Easy2708 extends PipsProblem {

    public Easy2708(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2, 3}, {4,5}, {5,6}, {6,7}, {0, 4}, {1, 5}, {2, 6}, {3, 7}}, 
              new int[][]{{6,0}, {0, 1}, {6,6}, {0, 0}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint eighteen = new SumConstraint(18, new int[]{2, 3, 7});
        SumConstraint one = new SumConstraint(1, new int[]{0});
        return new SumConstraint[]{one, eighteen};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 4, 5, 6});
        return new EqualsConstraint[]{a};
    }
    
}
