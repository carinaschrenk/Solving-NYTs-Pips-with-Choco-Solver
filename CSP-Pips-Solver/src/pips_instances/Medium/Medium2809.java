package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Medium2809 extends PipsProblem {

    public Medium2809(){

        super(10, 
              new int[][]{{0, 1}, 
                          {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},
                          {8, 9}, {9, 10}, {10, 11}, 
                          {12, 13}, {13, 14}, {14, 15}, 
                          {16, 17}, {17, 18}, {18, 19}, 
                          {0, 2}, {1, 3},
                          {2, 4}, {3, 5},
                          {4, 8}, {5, 9}, {6, 10}, {7, 11}, 
                          {10, 12}, {11, 13}, 
                          {12, 16}, {13, 17}, {14, 18}, {15, 19}}, 
              new int[][] {{4, 5}, {4, 1}, {2, 6}, {5, 6}, {1, 6}, 
                           {5, 5}, {3, 3}, {0, 6}, {6, 6}, {0, 1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(2, new int[]{5, 6});
        SumConstraint b = new SumConstraint(0, new int[]{14, 15});
        return new SumConstraint[]{a, b};
    }  

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 3});
        EqualsConstraint b = new EqualsConstraint(new int[]{0, 2, 4, 8});
        EqualsConstraint c = new EqualsConstraint(new int[]{7, 11});
        EqualsConstraint d = new EqualsConstraint(new int[]{9, 10, 12, 13, 16, 17});
        return new EqualsConstraint[]{a, b, c, d};
    }
    
}
