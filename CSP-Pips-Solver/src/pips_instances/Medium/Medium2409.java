package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.LargerConstraint;
import model.SumConstraint;

public class Medium2409 extends PipsProblem {

    public Medium2409(){

        super(8, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}, 
                          {7, 8}, 
                          {11, 10}, {11, 12}, {12, 13}, {13, 14}, {14, 15}, 
                          {0, 6}, {2, 7}, {3, 8}, {5, 9}, 
                          {6, 10}, {7, 12}, {8, 13}, {9, 15}}, 
              new int[][] {{4,6}, {2,3}, {5, 4}, {3, 5}, {3,3}, 
                           {5, 6}, {4, 4}, {2, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 6, 10, 11});
        EqualsConstraint b = new EqualsConstraint(new int[]{3, 8, 13});
        EqualsConstraint c = new EqualsConstraint(new int[]{5, 9, 14, 15});
        return new EqualsConstraint[]{a, b, c}; 
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(2, new int[]{4});
        return new SumConstraint[]{a};
    }  

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(10, new int[]{1, 2});
        return new LargerConstraint[]{a};
    }
    
}
