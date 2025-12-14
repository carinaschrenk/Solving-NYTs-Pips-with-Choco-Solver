package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;

public class Hard2409 extends PipsProblem {

    public Hard2409(){

        super(10, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},
                          {8, 9}, {9, 10}, {10, 11}, 
                          {12, 13}, {13, 14}, {14, 15},
                          {0, 4}, {1, 5}, {2, 6}, {3, 7}, 
                          {4, 8}, {5, 9}, {6, 10}, {7, 11}, 
                          {8, 12}, {9, 13}, {10, 14}, {11, 15},
                          {16, 17}, {17, 18}, {18, 19}, {19, 16}}, 
              new int[][] {{0, 5}, {2,2}, {4,4}, {5,3}, {6, 0}, 
                           {5, 5}, {1, 3}, {3, 3}, {6, 1}, {2, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), createSmallerConstraints(),
              null);
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{2, 6, 10, 11, 13, 14});
        return new UnequalsConstraint[]{a};
    } 

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 4, 8, 9});
        EqualsConstraint b = new EqualsConstraint(new int[]{16, 19});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{1, 5});
        SumConstraint b = new SumConstraint(1, new int[]{3});
        SumConstraint c = new SumConstraint(4, new int[]{7});
        SumConstraint f = new SumConstraint(6, new int[]{15});
        return new SumConstraint[]{a, b, c, f};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(1, new int[]{12});
        SmallerConstraint b = new SmallerConstraint(1, new int[]{18});
        return new SmallerConstraint[]{a, b};
    }
    
}
