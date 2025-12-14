package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Medium0610 extends PipsProblem {

    public Medium0610(){

        super(8, 
              new int[][]{{0, 1}, 
                          {2, 3}, {4, 5},
                          {6, 7}, {7, 8}, {8, 9}, {9, 10}, {10, 11}, 
                          {12, 13}, {13, 14}, {14, 15},
                          {0, 2}, {1, 3},
                          {2, 6}, {3, 7}, {4, 11},
                          {7, 12}, {8, 13}, {9, 14}, {10, 15}}, 
              new int[][] {{2, 5}, {0, 1}, {5, 5}, {0, 4}, {4, 4}, 
                           {0, 0}, {5, 6}, {3, 2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(10, new int[]{0, 2});
        SumConstraint b = new SumConstraint(6, new int[]{6});
        SumConstraint c = new SumConstraint(3, new int[]{12, 13, 14});
        SumConstraint d = new SumConstraint(2, new int[]{15});
        SumConstraint e = new SumConstraint(11, new int[]{10, 11, 4});
        SumConstraint f = new SumConstraint(0, new int[]{5});
        return new SumConstraint[]{a, b, c, d, e, f};
    }  

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{7, 8, 3});
        return new EqualsConstraint[]{a};
    }
    
}
