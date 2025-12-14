package pips_instances.Medium;

import model.PipsProblem;
import model.SumConstraint;

public class Medium0510 extends PipsProblem {

    public Medium0510(){

        super(5, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},
                          {0, 4}, {1, 5}, {2, 6}, {3, 7}, 
                          {4, 8}, {7, 9}}, 
              new int[][] {{1, 3}, {4, 1}, {6, 2}, {6, 5}, {1, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(8, new int[]{0, 4});
        SumConstraint b = new SumConstraint(13, new int[]{1, 2, 5});
        SumConstraint c = new SumConstraint(7, new int[]{3, 6, 7});
        return new SumConstraint[]{a, b, c};
    }  
    
}
