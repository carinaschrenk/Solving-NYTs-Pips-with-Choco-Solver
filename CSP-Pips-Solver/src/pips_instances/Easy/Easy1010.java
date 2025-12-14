package pips_instances.Easy;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Easy1010 extends PipsProblem {

    public Easy1010(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}}, 
              new int[][]{{4, 4}, {4, 1}, {3, 3}, {1, 1}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(3, new int[]{0,1,2});
        SumConstraint b = new SumConstraint(3, new int[]{7});
        return new SumConstraint[]{a, b};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{3, 4, 5});
        return new EqualsConstraint[]{a};
    } 
    
}
