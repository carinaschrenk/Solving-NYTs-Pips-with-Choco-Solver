package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SmallerConstraint;
import model.SumConstraint;

public class Medium0710 extends PipsProblem {

    public Medium0710(){

        super(9, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},
                          {8, 9}, 
                          {10, 11}, {11, 12}, {12, 13}, 
                          {14, 15}, {15, 16}, {16, 17}, 
                          {0, 4}, {1, 5}, {2, 6}, {3, 7},
                          {4, 8}, {5, 9}, 
                          {8, 10}, {9, 11}, 
                          {10, 14}, {11, 15}, {12, 16}, {13, 17}}, 
              new int[][] {{1, 0}, {0,6}, {1,2}, {4,2}, {3, 6}, 
                           {3, 3}, {2, 6}, {5, 2}, {3, 5}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 6, 7});
        EqualsConstraint b = new EqualsConstraint(new int[]{4, 5, 9, 11});
        EqualsConstraint c = new EqualsConstraint(new int[]{10, 14, 15});
        return new EqualsConstraint[]{a, b, c}; 
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(11, new int[]{12, 13, 16});
        return new SumConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(4, new int[]{0, 1});
        return new SmallerConstraint[]{a};
    }
    
}
