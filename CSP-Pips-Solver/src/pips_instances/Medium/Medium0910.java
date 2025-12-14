package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium0910 extends PipsProblem {

    public Medium0910(){

        super(10, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}, 
                          {8, 9}, {9, 10}, {10, 11}, {11, 12}, {12, 13}, {13, 14}, {14, 15}, 
                          {0, 8}, {1, 9}, {2, 10}, {3, 11}, {4, 12}, 
                          {5, 13}, {6, 14}, {7, 15}, 
                          {14, 16}, {16, 17},
                          {15, 18}, {18, 19}, 
                          {16, 18}, {17, 19}}, 
              new int[][] {{0, 4}, {1, 4}, {5, 0}, {6, 4}, {5, 4}, 
                           {4, 4}, {2, 4}, {2, 2}, {4, 3}, {0, 1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(), createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{9, 10, 11, 12, 13, 14, 16, 17});
        EqualsConstraint b = new EqualsConstraint(new int[]{18, 19});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{0, 1});
        SumConstraint b = new SumConstraint(0, new int[]{6, 7});
        return new SumConstraint[]{a, b};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{3});
        SmallerConstraint b = new SmallerConstraint(3, new int[]{4});
        return new SmallerConstraint[]{a, b};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(3, new int[]{2});
        return new LargerConstraint[]{a};
    }
    
}
