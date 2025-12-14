package pips_instances.Easy;

import model.PipsProblem;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.LargerConstraint;

public class Easy3009 extends PipsProblem {

    public Easy3009(){

        super(4, 
              new int[][]{{0, 1}, {2, 3}, {3, 4}, {4, 5},
                          {6, 7},
                           {0, 3}, {1, 4}, {3, 6}, {4, 7}}, 
              new int[][] {{4, 4}, {3,5}, {0,3}, {2,2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, createUnequalsConstraints(),
              null, 
              createSmallerConstraints(), createLargerConstraints());
    }


    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{1, 3, 4, 7});
        return new UnequalsConstraint[]{a};
    } 

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{6});
        LargerConstraint b = new LargerConstraint(3, new int[]{0});
        return new LargerConstraint[]{a, b};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(3, new int[]{5});
        return new SmallerConstraint[]{a};
    }
    
}
