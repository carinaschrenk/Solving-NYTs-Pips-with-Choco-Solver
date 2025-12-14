package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard1409 extends PipsProblem {

    public Hard1409(){

        super(16, 
              new int[][]{{0, 3},  
                          {1, 2}, {2, 3}, 
                          {5, 6}, 
                          {7, 8}, {8, 9}, {9, 10}, {10, 11},  
                          {13, 14}, {14, 15}, {15, 16},  
                          {17, 18}, {18, 19}, {19, 20}, 
                          {23, 24},  
                          {26, 27}, {27, 28}, {29, 30}, {30, 31}, 
                          {2, 4}, 
                          {4, 5}, 
                          {5, 9}, {6, 10}, 
                          {7, 12}, {9, 13}, {10, 14}, {11, 15}, 
                          {13, 17}, {14, 18}, {15, 19}, {16, 20}, 
                          {17, 22}, {19, 23}, {20, 24}, {21, 25}, 
                          {22, 28}, {24, 29}, {25, 31}},
              new int[][] {{5, 4}, {1, 4}, {5, 6}, {1, 5}, {4, 6}, 
                           {2, 2}, {6, 2}, {3, 5}, {1, 1}, {3, 2}, 
                           {2, 0}, {0, 5}, {4, 0}, {1, 0}, {0, 0}, 
                           {3, 3}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{8, 9, 13});
        EqualsConstraint b = new EqualsConstraint(new int[]{21, 25, 31});
        return new EqualsConstraint[]{a, b};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(1, new int[]{1});
        SumConstraint b = new SumConstraint(11, new int[]{2, 3});
        SumConstraint c = new SumConstraint(9, new int[]{5, 6});
        SumConstraint d = new SumConstraint(0, new int[]{7});
        SumConstraint e = new SumConstraint(3, new int[]{10, 11});
        SumConstraint f = new SumConstraint(1, new int[]{12});
        SumConstraint g = new SumConstraint(12, new int[]{14, 15});
        SumConstraint h = new SumConstraint(4, new int[]{16});
        SumConstraint i = new SumConstraint(8, new int[]{17, 18});
        SumConstraint j = new SumConstraint(2, new int[]{19, 23});
        SumConstraint k = new SumConstraint(0, new int[]{20, 24});
        SumConstraint l = new SumConstraint(2, new int[]{22});
        SumConstraint m = new SumConstraint(0, new int[]{26, 27, 28});
        SumConstraint n = new SumConstraint(10, new int[]{29, 30});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
    }
    
}
