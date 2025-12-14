package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard3108 extends PipsProblem {

    public Hard3108(){

        super(12, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {4, 5}, {5, 6},
                          {6, 7}, {8, 9}, {9, 10}, {10, 11},
                          {12, 13}, {13, 14}, {14, 15}, {15, 16},
                          {17, 18}, {18, 19}, {19, 20}, {21, 22},
                          {0, 5}, {1, 6}, {2, 7}, 
                          {4, 9}, {5, 10}, {6, 11},
                          {8, 13}, {9, 14}, {10, 15}, {11, 16},
                          {13, 17}, {14, 18}, {15, 19}, {16, 20},
                          {18, 21}, {19, 22}, {21, 23}}, 
              new int[][] {{2,4}, {3,3}, {2,2}, {0,4}, {4, 6}, {2, 1},
                            {3, 4}, {5, 6}, {1, 1}, {4, 4}, {6, 6}, {1, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 6, 7});
        EqualsConstraint b = new EqualsConstraint(new int[]{18, 19, 20, 21, 22});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(24, new int[]{4, 8, 9, 13});
        SumConstraint b = new SumConstraint(13, new int[]{0, 5, 10, 14, 15});
        SumConstraint c = new SumConstraint(0, new int[]{3});
        SumConstraint d = new SumConstraint(5, new int[]{12});
        SumConstraint e = new SumConstraint(4, new int[]{11, 16});
        SumConstraint f = new SumConstraint(0, new int[]{23});
        return new SumConstraint[]{a, b, c, d, e, f};
    }
    
}
