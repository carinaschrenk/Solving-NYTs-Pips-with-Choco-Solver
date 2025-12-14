package pips_instances.Medium;

import model.PipsProblem;
import model.UnequalsConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium0210 extends PipsProblem {

    public Medium0210(){

        super(5, 
              new int[][]{{0,1}, {1, 2}, {2, 3}, {3, 4},
                          {2, 5}, 
                          {5, 6},
                          {6, 7}, 
                          {7, 8}, 
                          {8, 9}}, 
              new int[][] {{1,0}, {1,3}, {3, 5}, {4, 1}, {2, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, createUnequalsConstraints(),
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{1, 2, 3});
        return new UnequalsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(1, new int[]{4});
        SumConstraint b = new SumConstraint(2, new int[]{5, 6});
        SumConstraint c = new SumConstraint(4, new int[]{7, 8});
        return new SumConstraint[]{a, b, c};
    }  

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{0});
        return new LargerConstraint[]{a};
    }
    
}
