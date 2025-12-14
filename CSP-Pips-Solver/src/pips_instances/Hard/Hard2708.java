package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard2708 extends PipsProblem {

    public Hard2708(){

        super(10, 
              new int[][]{{2, 3}, {3, 4}, {4, 5}, {5, 6},
                          {7, 8}, {8, 9}, {9, 10}, {10, 11}, 
                          {12, 13}, {13, 14}, {14, 15}, {15, 16}, {16, 17}, {17, 18},
                          {0, 3}, {1, 6}, 
                          {2, 7}, {3, 8}, {4, 9}, {5, 10}, {6, 11}, 
                          {7, 13}, {8, 14}, {9, 15}, {10, 16}, {11, 17}, 
                          {16, 19}}, 
              new int[][] {{5, 0}, {1,1}, {6,4}, {2,4}, {0, 1}, 
                           {1, 4}, {6, 6}, {1, 3}, {2, 5}, {2, 2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 7, 8, 9, 10});
        EqualsConstraint b = new EqualsConstraint(new int[]{3, 4});
        EqualsConstraint c = new EqualsConstraint(new int[]{5, 6});
        return new EqualsConstraint[]{a, b, c};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(6, new int[]{0});
        SumConstraint b = new SumConstraint(5, new int[]{1});
        SumConstraint c = new SumConstraint(6, new int[]{18});
        SumConstraint d = new SumConstraint(2, new int[]{19});
        SumConstraint e = new SumConstraint(0, new int[]{13, 14});
        return new SumConstraint[]{a, b, c, d, e};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(3, new int[]{15});
        return new LargerConstraint[]{a};
    }
    
}
