package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard1309 extends PipsProblem {

    public Hard1309(){

        super(16, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4},
                          {5, 6}, {6, 7}, {7, 8}, {8, 9}, 
                          {12, 13}, {13, 14}, {14, 15}, {15, 16}, {16, 17}, {17, 18}, {18, 19}, 
                          {20, 21}, {21, 22}, {22, 23}, {23, 24}, {24, 25}, 
                          {26, 27}, {27, 28}, {28, 29},  
                          {30, 31},
                          {0, 5}, {1, 6}, {2, 7}, {3, 8}, {4, 9},
                          {7, 10},
                          {10, 11},
                          {11, 15}, {30, 19}, 
                          {13, 20}, {14, 21}, {15, 22}, {16, 23}, {17, 24}, {18, 25}, 
                          {21, 26}, {22, 27}, {23, 28}, {24, 29}},
              new int[][] {{2, 3}, {4, 5}, {1, 2}, {4, 3}, {5, 2}, 
                           {3, 3}, {4, 1}, {5, 1}, {3, 0}, {6, 1}, 
                           {4, 0}, {6, 6}, {0, 1}, {5, 3}, {5, 6}, 
                           {2, 2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{7, 8, 10, 11, 15, 16});
        EqualsConstraint b = new EqualsConstraint(new int[]{12, 13, 14, 21, 22});
        return new EqualsConstraint[]{a, b};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(11, new int[]{0, 1});
        SumConstraint b = new SumConstraint(2, new int[]{2, 3});
        SumConstraint c = new SumConstraint(9, new int[]{4, 9});
        SumConstraint d = new SumConstraint(0, new int[]{17, 18});
        SumConstraint e = new SumConstraint(2, new int[]{30, 19});
        SumConstraint f = new SumConstraint(5, new int[]{31});
        SumConstraint g = new SumConstraint(1, new int[]{20});
        SumConstraint h = new SumConstraint(5, new int[]{23});
        SumConstraint i = new SumConstraint(5, new int[]{25});
        SumConstraint j = new SumConstraint(0, new int[]{26});
        SumConstraint k = new SumConstraint(18, new int[]{24, 28, 29});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, i, j, k };
    }
    
}
