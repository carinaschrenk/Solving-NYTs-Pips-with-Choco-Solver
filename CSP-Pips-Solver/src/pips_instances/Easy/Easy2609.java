package pips_instances.Easy;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SmallerConstraint;
import model.LargerConstraint;

public class Easy2609 extends PipsProblem {

    public Easy2609(){

        super(4, 
              new int[][] {{0,1}, {1,2}, {2,3}, {4,5}, {6, 7},
                           {2, 4}, {3, 5}, {4, 6}}, 
              new int[][]{{0, 6}, {3, 6}, {4, 6}, {6, 6}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              null, 
              createSmallerConstraints(), createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1, 2, 4, 6});
        return new EqualsConstraint[]{a};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(3, new int[]{3});
        return new SmallerConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(3, new int[]{7});
        return new LargerConstraint[]{a};
    }
    
}
