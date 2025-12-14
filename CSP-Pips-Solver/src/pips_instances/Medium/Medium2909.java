package pips_instances.Medium;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Medium2909 extends PipsProblem {

    public Medium2909(){

        super(8, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7}, 
                          {8, 9}, {9, 10}, {10, 11}, 
                          {12, 13}, {12, 14}, {13, 15}, {14, 15}}, 
              new int[][] {{4, 4}, {0, 4}, {0, 3}, {1,1},
                           {5, 5}, {6, 4}, {2, 0}, {2, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(), createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{5, 6});
        EqualsConstraint b = new EqualsConstraint(new int[]{9, 10, 11});
        EqualsConstraint c = new EqualsConstraint(new int[]{13, 15});
        return new EqualsConstraint[]{a, b, c};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(3, new int[]{12});
        SumConstraint b = new SumConstraint(2, new int[]{1, 2, 3});
        return new SumConstraint[]{a, b};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{7});
        return new SmallerConstraint[]{a};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{4});
        return new LargerConstraint[]{a};
    }
    
}
