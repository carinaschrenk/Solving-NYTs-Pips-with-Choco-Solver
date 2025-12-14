package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.LargerConstraint;
import model.SumConstraint;

public class Medium0110 extends PipsProblem {

    public Medium0110(){

        super(9, 
              new int[][]{{0, 1}, {1, 2}, 
                          {0, 3}, {2, 4}, 
                          {3, 5}, {4, 7}, 
                          {5, 6}, {6, 7},
                          {6, 8}, 
                          {8, 9}, 
                          {9, 10}, 
                          {10, 11}, {11, 12}, 
                          {10, 13}, 
                          {13, 14}, 
                          {14, 15}, {15, 16}, 
                          {14, 17}}, 
              new int[][] {{1,1}, {6,0}, {3, 1}, {5, 5}, {2, 4}, 
                           {3, 6}, {0, 2}, {4,4}, {6, 2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{14, 15});
        EqualsConstraint b = new EqualsConstraint(new int[]{10, 11, 13});
        return new EqualsConstraint[]{a, b}; 
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{0, 1});
        SumConstraint b = new SumConstraint(10, new int[]{3, 5});
        SumConstraint c = new SumConstraint(10, new int[]{7, 4});
        SumConstraint d = new SumConstraint(3, new int[]{2});
        SumConstraint e = new SumConstraint(0, new int[]{6, 8});
        return new SumConstraint[]{a, b, c, d, e};
    }  

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{17});
        return new LargerConstraint[]{a};
    }
    
}
