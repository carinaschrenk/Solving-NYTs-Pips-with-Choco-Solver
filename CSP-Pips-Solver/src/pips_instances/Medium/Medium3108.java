package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;

public class Medium3108 extends PipsProblem {

    public Medium3108(){

        super(4, 
              new int[][]{{0, 1}, {2, 3}, {3, 4}, {4, 5},
                          {6, 7}, {0, 4}, {1, 5}, {2, 6}, {3, 7}}, 
              new int[][] {{2,1}, {1,6}, {5,4}, {0,4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              null, null,
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{6, 7});
        return new EqualsConstraint[]{a};
    } 

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{2});
        LargerConstraint b = new LargerConstraint(6, new int[]{3, 4});
        LargerConstraint c = new LargerConstraint(6, new int[]{1, 5});
        return new LargerConstraint[]{a, b, c};
    }
    
}
