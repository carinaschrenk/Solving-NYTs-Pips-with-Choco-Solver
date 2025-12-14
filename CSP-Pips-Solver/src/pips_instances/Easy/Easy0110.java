package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.LargerConstraint;

public class Easy0110 extends PipsProblem {

    public Easy0110(){

        super(4, 
              new int[][]{{0, 1}, 
                          {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},
                          {1, 5}, {2, 6}, {3, 7}}, 
              new int[][] {{2, 6}, {6,5}, {2, 0}, {4,4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, createUnequalsConstraints(),
              createSumConstraints(), 
              createSmallerConstraints(), createLargerConstraints());
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(4, new int[]{7});
        return new SumConstraint[]{a}; 
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{1, 2, 3, 5});
        return new UnequalsConstraint[]{a};
    } 

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{6});
        return new LargerConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{0});
        SmallerConstraint b = new SmallerConstraint(3, new int[]{4});
        return new SmallerConstraint[]{a, b};
    }
    
}
