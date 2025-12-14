package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;

public class Medium1010 extends PipsProblem {

    public Medium1010(){

        super(10, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},
                          {12, 13}, {13, 14}, {14, 15}, 
                          {16, 17}, {17, 18}, {18, 19}, 
                          {0, 4}, {1, 5}, {2, 6}, {3, 7},
                          {4, 8}, {7, 9}, 
                          {8, 10}, {9, 11}, 
                          {10, 12}, {11, 15}, 
                          {12, 16}, {13, 17}, {14, 18}, {15, 19}}, 
              new int[][] {{5, 4}, {6, 6}, {2, 3}, {5, 5}, {3, 6}, 
                           {4, 6}, {3, 0}, {0, 5}, {2, 5}, {4, 1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{6, 7, 9, 11, 15});
        EqualsConstraint b = new EqualsConstraint(new int[]{4, 8, 10, 12});
        EqualsConstraint c = new EqualsConstraint(new int[]{1, 5});
        return new EqualsConstraint[]{a, b, c}; 
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{13, 14, 17});
        return new UnequalsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{18, 19});
        return new SumConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(4, new int[]{0});
        SmallerConstraint b = new SmallerConstraint(4, new int[]{2});
        SmallerConstraint c = new SmallerConstraint(4, new int[]{3});
        return new SmallerConstraint[]{a, b, c};
    }
    
}
