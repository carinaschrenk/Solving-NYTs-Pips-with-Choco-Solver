package pips_instances.Easy;

import model.EqualsConstraint;
import model.LargerConstraint;
import model.PipsProblem;

public class Easy1410 extends PipsProblem {

    public Easy1410(){

        super(5, 
              new int[][] {{2, 3}, {3, 4}, {4, 5}, 
                           {6, 7}, {7, 8}, {8, 9}, 
                           {0, 2}, {1, 5}, 
                           {2, 6}, {3, 7}, {4, 8}, {5, 9}}, 
              new int[][]{{6, 5}, {3, 4}, {6, 6}, {3, 2}, {3, 3}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              null, 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 3, 4, 5});
        EqualsConstraint b = new EqualsConstraint(new int[]{6, 7, 8});
        return new EqualsConstraint[]{a, b};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(3, new int[]{1});
        return new LargerConstraint[]{a};
    }
    
}
