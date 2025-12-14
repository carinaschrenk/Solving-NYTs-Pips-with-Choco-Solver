package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;

public class Hard2608 extends PipsProblem {

    public Hard2608(){

        super(10, 
              new int[][]{{0, 1}, {2, 3}, {4, 5}, {5, 6}, {6, 7},
                          {8, 9}, {9, 10}, {10, 11}, 
                          {14, 15}, {16, 17}, {17, 18}, {18, 19},
                          {0, 2}, {1, 3}, 
                          {3, 4}, {4, 8}, {5, 9}, {6, 10}, {7, 11}, 
                          {8, 12}, {11, 13},
                          {13, 14}, {18, 14}, {19, 15}}, 
              new int[][] {{3, 4}, {0,6}, {6,3}, {6,4}, {6, 1}, 
                           {3, 0}, {1, 4}, {2, 3}, {4, 5}, {3, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), createSmallerConstraints(),
              null);
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{6, 10, 11});
        return new UnequalsConstraint[]{a};
    } 

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{13, 14, 18});
        EqualsConstraint b = new EqualsConstraint(new int[]{4, 8, 12});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{0, 2});
        SumConstraint b = new SumConstraint(1, new int[]{1, 3});
        SumConstraint c = new SumConstraint(12, new int[]{5, 9});
        SumConstraint d = new SumConstraint(4, new int[]{15});
        SumConstraint e = new SumConstraint(0, new int[]{19});
        SumConstraint f = new SumConstraint(6, new int[]{17});
        return new SumConstraint[]{a, b, c, d, e, f};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{16});
        return new SmallerConstraint[]{a};
    }
    
}
