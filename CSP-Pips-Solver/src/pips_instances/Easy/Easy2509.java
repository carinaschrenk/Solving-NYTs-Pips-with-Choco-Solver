package pips_instances.Easy;

import model.EqualsConstraint;
import model.LargerConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Easy2509 extends PipsProblem {

    public Easy2509(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2, 3}, {2,4}, 
                           {5,3}, {4,5}, {6, 7}, {4, 6}, {5, 7}}, 
              new int[][]{{2, 3}, {3, 1}, {1, 5}, {3, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{1, 2, 4});
        SumConstraint b = new SumConstraint(5, new int[]{5});
        return new SumConstraint[]{a, b};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{6, 7});
        return new EqualsConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(2, new int[]{3});
        return new LargerConstraint[]{a};
    }
    
}
