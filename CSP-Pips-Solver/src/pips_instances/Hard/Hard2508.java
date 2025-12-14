package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard2508 extends PipsProblem {

    public Hard2508(){

        super(10, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}, 
                          {8, 9}, {9, 10}, {10, 11}, {11, 12}, {12, 13}, {13, 14}, {14, 15},
                          {0, 8}, {1, 9}, {2, 10}, {3, 11}, {4, 12},
                          {5, 13}, {6, 14}, {7, 15}, 
                          {16, 17}, {17, 19}, {19, 18}, {18, 16},
                          {17, 2}, {19, 3}}, 
              new int[][] {{1,3}, {2,0}, {2,3}, {5,1}, {0, 0}, 
                           {4, 4}, {3, 0}, {4, 3}, {5, 0}, {6, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 1, 9, 10});
        EqualsConstraint b = new EqualsConstraint(new int[]{16, 17, 18, 19});
        EqualsConstraint c = new EqualsConstraint(new int[]{11, 12, 13, 14});
        return new EqualsConstraint[]{a, b, c};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(1, new int[]{0});
        SumConstraint b = new SumConstraint(1, new int[]{5});
        SumConstraint c = new SumConstraint(11, new int[]{7, 15});
        return new SumConstraint[]{a, b, c};
    }
    
}
