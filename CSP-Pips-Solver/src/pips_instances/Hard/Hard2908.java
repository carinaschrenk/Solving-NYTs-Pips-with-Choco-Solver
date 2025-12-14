package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard2908 extends PipsProblem {

    public Hard2908(){

        super(10, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5},
                          {5, 6}, {6, 7}, {7, 8}, {8, 9}, 
                          {10, 11}, {11, 12}, {12, 13}, {13, 14},
                          {14, 15}, {15, 16}, {16, 17}, {17, 18}, {18, 19},
                          {0, 10}, {1, 11}, {2, 12}, {3, 13}, {4, 14},
                          {5, 15}, {6, 16}, {7, 17}, {8, 18}, {9, 19}}, 
              new int[][] {{1,1}, {5,3}, {6,6}, {5,6}, {6, 0}, 
                           {2, 0}, {3, 4}, {5, 1}, {2, 6}, {2, 1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 12});
        EqualsConstraint b = new EqualsConstraint(new int[]{3, 4});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(9, new int[]{0, 1});
        SumConstraint b = new SumConstraint(12, new int[]{13, 14});
        SumConstraint c = new SumConstraint(2, new int[]{5, 6, 15, 16});
        SumConstraint d = new SumConstraint(10, new int[]{7, 17});
        SumConstraint e = new SumConstraint(3, new int[]{8});
        SumConstraint f = new SumConstraint(18, new int[]{18, 9, 19});
        return new SumConstraint[]{a, b, c, d, e, f};
    }
    
}
