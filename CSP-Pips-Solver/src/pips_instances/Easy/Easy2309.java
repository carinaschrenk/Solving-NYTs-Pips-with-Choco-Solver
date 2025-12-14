package pips_instances.Easy;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SmallerConstraint;
import model.SumConstraint;

public class Easy2309 extends PipsProblem {

    public Easy2309(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2,3}, {3, 4}, {4,5}, {3, 7}, {6, 7}}, 
              new int[][]{{4, 1}, {4, 4}, {4, 3}, {5, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(5, new int[]{5});
        return new SumConstraint[]{a};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 2, 3, 4, 7});
        return new EqualsConstraint[]{a};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{6});
        return new SmallerConstraint[]{a};
    }
    
}
