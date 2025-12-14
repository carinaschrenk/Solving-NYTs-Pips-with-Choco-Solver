package pips_instances.Medium;

import model.PipsProblem;
import model.SmallerConstraint;
import model.SumConstraint;

public class Medium3009 extends PipsProblem {

    public Medium3009(){

        super(5, 
              new int[][]{{2, 3}, {3, 4}, 
                          {5, 6},
                          {8, 9}, 
                          {0, 1}, {3, 5}, {4, 6}, {5, 7},
                          {7, 8}}, 
              new int[][] {{6, 4}, {0,5}, {5,2}, {1,3}, {1, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(8, new int[]{1, 3, 4, 5});
        SumConstraint b = new SumConstraint(10, new int[]{7, 8});
        return new SumConstraint[]{a, b};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(3, new int[]{2});
        SmallerConstraint b = new SmallerConstraint(5, new int[]{6});
        return new SmallerConstraint[]{a, b};
    }
    
}
