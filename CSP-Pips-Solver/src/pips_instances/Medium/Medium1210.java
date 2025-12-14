package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium1210 extends PipsProblem {

    public Medium1210(){

        super(8, 
              new int[][]{{1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},  
                          {8, 9}, {9, 10}, {10, 11}, {11, 12},  
                          {13, 14}, {14, 15},
                          {0, 3}, 
                          {1, 5}, {2, 6}, {3, 7}, 
                          {4, 8}, {5, 9}, {6, 10}, {7, 11}, 
                          {8, 13}, {9, 14}, {10, 15}}, 
              new int[][] {{6, 2}, {0, 5}, {0, 0}, {2, 3}, {3, 0}, 
                           {1, 3}, {1, 5}, {5, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{11, 12});
        EqualsConstraint b = new EqualsConstraint(new int[]{5, 6, 9, 10});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{3, 7});
        SumConstraint b = new SumConstraint(2, new int[]{8, 13});
        SumConstraint c = new SumConstraint(7, new int[]{14, 15});
        return new SumConstraint[]{a, b, c};
    }  

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint b = new LargerConstraint(5, new int[]{1});
        return new LargerConstraint[]{b};
    }
    
}
