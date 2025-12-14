package pips_instances.Easy;

import model.EqualsConstraint;
import model.LargerConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Easy1210 extends PipsProblem {

    public Easy1210(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2, 3}, {3,4}, 
                           {4,5}, {4, 6}, {6, 7}}, 
              new int[][]{{2, 0}, {2, 1}, {2, 2}, {3, 2}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{5});
        SumConstraint b = new SumConstraint(1, new int[]{7});
        return new SumConstraint[]{a, b};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 2, 3, 4, 6});
        return new EqualsConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(2, new int[]{0});
        return new LargerConstraint[]{a};
    }
    
}
