package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.UnequalsConstraint;
import model.SumConstraint;

public class Hard1210 extends PipsProblem {

    public Hard1210(){

        super(9, 
              new int[][]{{1, 2}, {2, 3}, {3, 4},
                          {5, 6}, {6, 7}, {7, 8},
                          {9, 10}, {10, 11}, {11, 12},
                          {13, 14}, {14, 15}, {15, 16},
                          {0, 4}, 
                          {1, 5}, {2, 6}, {3, 7}, {4, 8}, 
                          {5, 9}, {6, 10}, {7, 11}, {8, 12}, 
                          {9, 13}, {10, 14}, {11, 15}, {12, 16},
                          {14, 17}}, 
              new int[][] {{0, 6}, {2, 6}, {2, 4}, {6, 4}, {4, 0}, 
                           {4, 5}, {1, 5}, {4, 4}, {5, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), null,
              null);
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{2, 5, 6, 7});
        UnequalsConstraint b = new UnequalsConstraint(new int[]{13, 14, 15});
        return new UnequalsConstraint[]{a, b};
    } 

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 4, 8});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(4, new int[]{1});
        SumConstraint b = new SumConstraint(1, new int[]{3});
        SumConstraint c = new SumConstraint(2, new int[]{9});
        SumConstraint d = new SumConstraint(0, new int[]{10});
        SumConstraint e = new SumConstraint(2, new int[]{11});
        SumConstraint f = new SumConstraint(5, new int[]{12});
        SumConstraint g = new SumConstraint(3, new int[]{16});
        return new SumConstraint[]{a, b, c, d, e, f, g};
    }
    
}
