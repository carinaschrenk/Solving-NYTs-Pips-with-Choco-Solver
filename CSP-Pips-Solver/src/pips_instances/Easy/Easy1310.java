package pips_instances.Easy;

import model.EqualsConstraint;
import model.LargerConstraint;
import model.PipsProblem;
import model.SumConstraint;
import model.UnequalsConstraint;

public class Easy1310 extends PipsProblem {

    public Easy1310(){

        super(6, 
              new int[][] {{0,1}, {1,2}, {2, 3}, {3,4}, 
                           {2,5}, {5, 6}, {6, 9}, 
                           {7, 8}, {8, 9}, {9, 10}, {10, 11}}, 
              new int[][]{{0, 3}, {2, 2}, {1, 1}, {5, 3}, {0, 2}, {0, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(2, new int[]{7, 8});
        return new SumConstraint[]{a};
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{1, 2, 3});
        return new UnequalsConstraint[]{a};
    } 

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{9, 10, 11});
        EqualsConstraint b = new EqualsConstraint(new int[]{5, 6});
        return new EqualsConstraint[]{a, b};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{4});
        return new LargerConstraint[]{a};
    }
    
}
