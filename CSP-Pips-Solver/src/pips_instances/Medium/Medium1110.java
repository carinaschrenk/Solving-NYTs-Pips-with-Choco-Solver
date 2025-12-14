package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium1110 extends PipsProblem {

    public Medium1110(){

        super(8, 
              new int[][]{{1, 2}, {2, 3}, {3, 4}, 
                          {5, 6}, {6, 7}, {7, 8}, {8, 9}, 
                          {10, 11}, {11, 12}, {12, 13}, {13, 14},
                          {0, 3}, 
                          {1, 6}, {2, 7}, {3, 8}, {4, 9}, 
                          {5, 10}, {6, 11}, {7, 12}, {8, 13}, {9, 14},
                          {12, 15}}, 
              new int[][] {{5, 2}, {0, 2}, {3, 0}, {0, 4}, {6, 0}, 
                           {3, 3}, {1, 0}, {5, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(), createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 3});
        EqualsConstraint b = new EqualsConstraint(new int[]{8, 9});
        EqualsConstraint c = new EqualsConstraint(new int[]{2, 7, 11, 12, 13});
        return new EqualsConstraint[]{a, b, c};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(4, new int[]{5, 10});
        return new SumConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(3, new int[]{14});
        return new SmallerConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint b = new LargerConstraint(4, new int[]{1});
        return new LargerConstraint[]{b};
    }
    
}
