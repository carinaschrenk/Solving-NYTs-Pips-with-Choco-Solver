package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard2410 extends PipsProblem {

    public Hard2410(){

        super(16, 
              new int[][]{{0, 1}, 
                          {2, 3}, {3, 4}, 
                          {5, 6}, {6, 7}, {7, 8}, {8, 9}, {9, 10}, {10, 11}, 
                          {12, 13}, {13, 14}, {14, 15}, {15, 16}, {16, 17}, 
                          {18, 19}, {19, 20}, {20, 21}, {21, 22}, {22, 23}, 
                          {24, 25}, {25, 26}, {26, 27}, 
                          {30, 31}, 
                          {0, 3}, {1, 4}, 
                          {2, 5}, {3, 6}, {4, 7}, 
                          {7, 12}, {8, 13}, {9, 14}, {10, 15}, {11, 16}, 
                          {12, 18}, {13, 19}, {14, 20}, {15, 21}, {16, 22}, {17, 23}, 
                          {19, 24}, {20, 25}, {21, 26}, {22, 27}, 
                          {25, 28},
                          {28, 29}, 
                          {29, 31}},
              new int[][] {{6, 4}, {5, 0}, {0, 4}, {2, 4}, {0, 6}, 
                           {1, 3}, {1, 4}, {0, 0}, {0, 2}, {3, 3}, 
                           {1, 0}, {3, 0}, {1, 6}, {5, 4}, {3, 2}, 
                           {6, 5}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), 
              null, 
              createSumConstraints(), 
              null, null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{29, 30, 31});
        EqualsConstraint b = new EqualsConstraint(new int[]{9, 14, 15, 16, 20});
        return new EqualsConstraint[]{a, b};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{0, 1});
        SumConstraint b = new SumConstraint(8, new int[]{2, 3});
        SumConstraint c = new SumConstraint(4, new int[]{5, 6});
        SumConstraint d = new SumConstraint(5, new int[]{8});
        SumConstraint e = new SumConstraint(4, new int[]{10});
        SumConstraint f = new SumConstraint(1, new int[]{11});
        SumConstraint g = new SumConstraint(2, new int[]{13});
        SumConstraint h = new SumConstraint(1, new int[]{17});
        SumConstraint i = new SumConstraint(12, new int[]{18, 19});
        SumConstraint j = new SumConstraint(4, new int[]{21});
        SumConstraint k = new SumConstraint(12, new int[]{22, 23});
        SumConstraint l = new SumConstraint(5, new int[]{24});
        SumConstraint m = new SumConstraint(5, new int[]{26});
        SumConstraint n = new SumConstraint(0, new int[]{27});
        SumConstraint o = new SumConstraint(2, new int[]{25, 28});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
    }
    
}
