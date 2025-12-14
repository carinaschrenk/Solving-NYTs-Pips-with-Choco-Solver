package pips_instances.Easy;

import model.EqualsConstraint;
import model.PipsProblem;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.LargerConstraint;

public class Easy2809 extends PipsProblem {

    public Easy2809(){

        super(4, 
              new int[][]{{0, 1}, {2, 3}, {3, 4}, 
                          {5, 6}, {6, 7},
                           {1, 3}, {2, 5}, {3, 6}, {4, 7}}, 
              new int[][] {{1, 3}, {4,5}, {3,3}, {4,2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              null, 
              createSmallerConstraints(), createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 5, 6});
        return new EqualsConstraint[]{a}; 
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{1, 3});
        return new UnequalsConstraint[]{a};
    } 

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{0});
        return new LargerConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{7});
        return new SmallerConstraint[]{a};
    }
    
}
