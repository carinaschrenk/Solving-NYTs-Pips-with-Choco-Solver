package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Medium0310 extends PipsProblem {

    public Medium0310(){

        super(11, 
              new int[][]{{0, 1}, {1, 2}, {2, 3},
                          {0, 4}, {1, 5}, {2, 6}, {3, 7},
                          {4, 5}, {5, 6}, {6, 7},
                          {4, 8}, {7, 9},
                          {8, 10}, {9, 11}, 
                          {10, 12}, {11, 13},
                          {12, 14}, {13, 17},
                          {14, 15}, {15, 16}, {16, 17},
                          {14, 18}, {15, 19}, {16, 20}, {17, 21},
                          {18, 19}, {19, 20}, {20, 21}}, 
              new int[][] {{3, 3}, {6, 0}, {3, 5}, {2, 5}, {4, 3}, 
                           {1, 5}, {4, 1}, {4, 4}, {1, 0}, {2, 4}, 
                           {1, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{8, 10});
        SumConstraint b = new SumConstraint(12, new int[]{12, 14});
        SumConstraint c = new SumConstraint(15, new int[]{15, 16, 20});
        return new SumConstraint[]{a, b, c};
    }  

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1, 2});
        EqualsConstraint b = new EqualsConstraint(new int[]{4, 5});
        EqualsConstraint c = new EqualsConstraint(new int[]{3, 6, 7, 9, 11});
        EqualsConstraint d = new EqualsConstraint(new int[]{13, 17});
        EqualsConstraint e = new EqualsConstraint(new int[]{18, 19});
        return new EqualsConstraint[]{a, b, c, d, e};
    }
    
}
