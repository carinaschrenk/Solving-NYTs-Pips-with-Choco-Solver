package pips_instances.Medium;

import model.PipsProblem;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium2709 extends PipsProblem {

    public Medium2709(){

        super(5, 
              new int[][]{{1, 2}, {2, 3}, 
                          {4, 5}, {5, 6},
                          {8, 9}, 
                          {0, 3}, 
                          {1, 4}, {2, 5}, {3, 6}, 
                          {6, 7}, 
                          {7, 8}}, 
              new int[][] {{0,0}, {1,1}, {2,2}, {3,3}, {4,4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, createUnequalsConstraints(),
              createSumConstraints(), 
              createSmallerConstraints(), createLargerConstraints());
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{1, 2, 3, 6});
        return new UnequalsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(7, new int[]{7, 8, 9});
        return new SumConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{0});
        return new SmallerConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(2, new int[]{4});
        LargerConstraint b = new LargerConstraint(1, new int[]{5});
        return new LargerConstraint[]{a, b};
    }
    
}
