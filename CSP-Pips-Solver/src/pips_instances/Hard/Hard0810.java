package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;

public class Hard0810 extends PipsProblem {

    public Hard0810(){

        super(11, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4},
                          {8, 9}, {9, 10}, {10, 11}, {11, 12},
                          {13, 14}, {15, 16}, 
                          {17, 18}, {18, 19}, {19, 20}, {20, 21},
                          {0, 5}, {2, 6}, {4, 7}, 
                          {5, 8}, {6, 10}, {7, 12}, 
                          {8, 13}, {9, 14}, {11, 15}, {12, 16},
                          {13, 17}, {14, 18}, {15, 20}, {16, 21}}, 
              new int[][] {{0, 0}, {1,5}, {2,3}, {0,1}, {6, 5}, 
                           {4, 4}, {1, 3}, {0, 6}, {0, 3}, {1, 4}, 
                           {1, 1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), createSmallerConstraints(),
              null);
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{12, 16});
        return new UnequalsConstraint[]{a};
    } 

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{13, 14, 17});
        EqualsConstraint b = new EqualsConstraint(new int[]{18, 19, 20, 21});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(11, new int[]{0, 1, 2});
        SumConstraint b = new SumConstraint(1, new int[]{4, 7});
        SumConstraint c = new SumConstraint(1, new int[]{5});
        SumConstraint d = new SumConstraint(11, new int[]{9, 10});
        SumConstraint e = new SumConstraint(11, new int[]{11, 15});
        return new SumConstraint[]{a, b, c, d, e};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(1, new int[]{3});
        return new SmallerConstraint[]{a};
    }
    
}
