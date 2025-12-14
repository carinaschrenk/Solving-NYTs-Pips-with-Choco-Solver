package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium1310 extends PipsProblem {

    public Medium1310(){

        super(6, 
              new int[][]{{0, 1}, 
                          {2, 3}, {3, 4},  
                          {7, 8}, {8, 9}, 
                          {10, 11}, 
                          {0, 2}, {1, 3}, 
                          {2, 5}, {4, 6}, 
                          {5, 7}, {6, 9}, 
                          {8, 10}, {9, 11}}, 
              new int[][] {{1, 5}, {2, 5}, {3, 5}, {6, 3}, {2, 6}, 
                           {2, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{11, 10});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(15, new int[]{2, 3, 4});
        SumConstraint b = new SumConstraint(3, new int[]{6});
        SumConstraint c = new SumConstraint(15, new int[]{7, 8, 9});
        return new SumConstraint[]{a, b, c};
    }  

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(1, new int[]{1});
        LargerConstraint b = new LargerConstraint(2, new int[]{5});
        return new LargerConstraint[]{a, b};
    }
    
}
