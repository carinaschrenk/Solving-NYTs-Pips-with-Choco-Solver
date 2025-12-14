package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard1310 extends PipsProblem {

    public Hard1310(){

        super(7, 
              new int[][]{{4, 5}, {5, 6}, {6, 7}, {7, 8}, 
                          {9, 10}, {10, 11}, {11, 12}, {12, 13},
                          {0, 2}, {1, 3}, 
                          {2, 5}, {3, 7}, 
                          {4, 9}, {5, 10}, {6, 11}, {7, 12}, {8, 13}}, 
              new int[][] {{4, 1}, {1, 2}, {6, 5}, {0, 5}, {0, 6}, 
                           {1, 6}, {3, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{3, 6, 7});
        EqualsConstraint b = new EqualsConstraint(new int[]{4, 9});
        EqualsConstraint c = new EqualsConstraint(new int[]{11, 12});
        return new EqualsConstraint[]{a, b, c};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{2, 5});
        return new SumConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(1, new int[]{0});
        LargerConstraint b = new LargerConstraint(4, new int[]{8});
        return new LargerConstraint[]{a, b};
    }
    
}
