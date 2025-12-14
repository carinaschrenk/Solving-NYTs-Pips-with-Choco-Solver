package pips_instances.Medium;

import model.PipsProblem;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;

public class Medium3008 extends PipsProblem {

    public Medium3008(){

        super(6, 
              new int[][]{{0, 1}, {2, 3}, {4, 5}, {6, 7},
                          {7, 8}, {8, 9}, {10, 11}, {0, 2}, {1, 3},
                          {2, 4}, {3, 5}, {4, 7}, {5, 8},
                          {7, 10}, {8, 11}}, 
              new int[][] {{2,2}, {0,0}, {3,4}, {5,3}, {1, 6}, {1, 1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, createUnequalsConstraints(),
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{4, 5, 7, 8});
        return new UnequalsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(1, new int[]{6});
        SumConstraint b = new SumConstraint(2, new int[]{9});
        SumConstraint c = new SumConstraint(6, new int[]{0, 1, 2, 3});
        return new SumConstraint[]{a, b, c};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(3, new int[]{10, 11});
        return new SmallerConstraint[]{a};
    }
    
}
