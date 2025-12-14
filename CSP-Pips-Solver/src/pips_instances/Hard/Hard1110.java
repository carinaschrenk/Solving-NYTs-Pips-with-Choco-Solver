package pips_instances.Hard;

import model.PipsProblem;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard1110 extends PipsProblem {

    public Hard1110(){

        super(6, 
              new int[][]{{0, 1},
                          {2, 3}, {3, 4}, {4, 5}, 
                          {6, 7}, {7, 8}, {8, 9},  
                          {0, 2}, {1, 3}, 
                          {2, 6}, {3, 7}, {4, 8}, {5, 9}, 
                          {6, 10}, {9, 11}}, 
              new int[][] {{5, 6}, {4,0}, {3,5}, {5,4}, {6, 3}, 
                           {1, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), null,
              createLargerConstraints());
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(5, new int[]{0});
        SumConstraint b = new SumConstraint(10, new int[]{2, 6});
        SumConstraint c = new SumConstraint(7, new int[]{3, 4});
        SumConstraint d = new SumConstraint(4, new int[]{7});
        SumConstraint e = new SumConstraint(9, new int[]{5, 9});
        return new SumConstraint[]{a, b, c, d, e};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{10});
        return new LargerConstraint[]{a};
    }
    
}
