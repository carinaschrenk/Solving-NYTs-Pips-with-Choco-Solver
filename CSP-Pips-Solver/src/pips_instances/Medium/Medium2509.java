package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Medium2509 extends PipsProblem {

    public Medium2509(){

        super(10, 
              new int[][]{{0, 1}, 
                          {2, 3}, {3, 4}, {4, 5},
                          {6, 7}, {7, 8}, {8, 9}, {9, 10}, {10, 11}, 
                          {16, 17}, {17, 18}, {18, 19},
                          {0, 3}, {1, 4},
                          {2, 7}, {3, 8}, {4, 9}, {5, 10}, 
                          {6, 12}, {8, 13}, {11, 14}, 
                          {12, 15}, {13, 16}, {14, 19}}, 
              new int[][] {{3, 1}, {4, 5}, {0, 0}, {2, 3}, {0, 3}, 
                           {1, 0}, {2, 6}, {5, 2}, {3, 3}, {5, 1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(1, new int[]{12, 6});
        SumConstraint b = new SumConstraint(1, new int[]{15});
        SumConstraint c = new SumConstraint(3, new int[]{5, 10});
        SumConstraint d = new SumConstraint(10, new int[]{11, 14});
        SumConstraint e = new SumConstraint(11, new int[]{16, 17});
        return new SumConstraint[]{a, b, c, d, e};
    }  

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 2, 3});
        EqualsConstraint b = new EqualsConstraint(new int[]{1, 4, 7, 8, 9});
        EqualsConstraint c = new EqualsConstraint(new int[]{18, 19});
        return new EqualsConstraint[]{a, b, c};
    }
    
}
