package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium2708 extends PipsProblem {

    public Medium2708(){

        super(8, 
              new int[][]{{1, 2}, {2, 3}, {3, 4}, 
                          {5, 6}, {6, 7}, {7, 8}, {8, 9}, 
                          {10, 11}, {11, 12}, {12, 13},
                          {0, 4}, {1, 5}, {2, 6}, {3, 7}, {4, 8}, 
                          {5, 10}, {6, 11}, {7, 12}, {8, 13},
                          {10, 14}, {13, 15}}, 
              new int[][] {{0,0}, {1, 1}, {5,1}, {3,3}, {1, 4}, {6, 2}, {2, 5}, {1, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(), createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{5, 10, 11, 12, 14});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(12, new int[]{3, 7});
        return new SumConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(5, new int[]{1});
        return new SmallerConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(2, new int[]{0});
        LargerConstraint b = new LargerConstraint(4, new int[]{15});
        return new LargerConstraint[]{a, b};
    }
    
}
