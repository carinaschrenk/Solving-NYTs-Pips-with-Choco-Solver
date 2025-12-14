package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.EqualsConstraint;

public class Easy2608 extends PipsProblem {

    public Easy2608(){

        super(4, 
              new int[][] {{0,1}, {2, 3}, {3,4}, {4,5}, {5,6}, {0, 3}, {1, 4}, {4, 7}}, 
              new int[][]{{1, 4}, {0, 6}, {2, 6}, {2, 1}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint four = new SumConstraint(4, new int[]{2});
        SumConstraint six = new SumConstraint(6, new int[]{4});
        SumConstraint two = new SumConstraint(2, new int[]{5});
        return new SumConstraint[]{four, six, two};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 3});
        return new EqualsConstraint[]{a};
    }
    
}
