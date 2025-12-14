package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.EqualsConstraint;

public class Easy2408 extends PipsProblem {

    public Easy2408(){

        super(4, 
              new int[][] {{0,1}, {2, 3}, {4,5}, {5,6}, {6, 7}, {2, 4}, {3, 5}}, 
              new int[][]{{0, 4}, {5, 6}, {4, 4}, {1, 1}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint six = new SumConstraint(6, new int[]{1});
        return new SumConstraint[]{six};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 3});
        EqualsConstraint b = new EqualsConstraint(new int[]{5, 6, 7});
        return new EqualsConstraint[]{a, b};
    }
    
}
