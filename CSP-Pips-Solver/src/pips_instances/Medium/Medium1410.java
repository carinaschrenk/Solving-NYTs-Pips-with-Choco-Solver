package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium1410 extends PipsProblem {

    public Medium1410(){

        super(6, 
              new int[][]{{0, 1}, {1, 2},
                          {5, 6}, {6, 7},
                          {0, 3}, {2, 4}, 
                          {3, 5}, {4, 7}, 
                          {5, 8}, {7, 9}, 
                          {8, 10}, {9, 11}}, 
              new int[][] {{2, 5}, {3, 1}, {0, 5}, {0, 3}, {4, 5}, 
                           {0, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{6, 7, 9});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(5, new int[]{0, 1});
        SumConstraint b = new SumConstraint(9, new int[]{2, 4});
        SumConstraint c = new SumConstraint(9, new int[]{5, 8});
        return new SumConstraint[]{a, b, c};
    }  

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(3, new int[]{10});
        return new LargerConstraint[]{a};
    }
    
}
