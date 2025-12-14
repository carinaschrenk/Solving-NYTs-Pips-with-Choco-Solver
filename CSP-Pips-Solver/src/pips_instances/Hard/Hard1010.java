package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard1010 extends PipsProblem {

    public Hard1010(){

        super(16, 
              new int[][]{{2, 3}, 
                          {5, 6}, {6, 7},
                          {10, 11}, {11, 12}, 
                          {14, 15}, 
                          {0, 2}, {1, 4}, 
                          {2, 5}, {3, 6}, {4, 8}, 
                          {5, 9}, {7, 10}, {8, 12}, 
                          {9, 13}, {11, 14}, {12, 15}, 
                          {13, 16}, {15, 17}, 
                          {18, 19}, {19, 20}, 
                          {20, 21}, {21, 22}, {22, 23}, {23, 24}, {24, 25}, 
                          {25, 26}, {26, 27}, 
                          {27, 28}, {28, 29}, {29, 30}, {30, 31}, {31, 18}},
              new int[][] {{5, 4}, {3, 3}, {4, 0}, {4, 4}, {3,2}, 
                           {3, 5}, {6, 2}, {0, 1}, {3, 1}, {6, 5}, 
                           {4, 1}, {6, 3}, {0, 5}, {3, 4}, {6, 6}, 
                           {0, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{10, 11, 12, 14, 15});
        EqualsConstraint b = new EqualsConstraint(new int[]{4, 8});
        EqualsConstraint c = new EqualsConstraint(new int[]{28, 29});
        EqualsConstraint d = new EqualsConstraint(new int[]{18, 19, 20, 21});
        return new EqualsConstraint[]{a, b, c, d};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(18, new int[]{0, 2, 3});
        SumConstraint b = new SumConstraint(10, new int[]{5, 6});
        SumConstraint c = new SumConstraint(5, new int[]{9, 13});
        SumConstraint d = new SumConstraint(0, new int[]{16});
        SumConstraint e = new SumConstraint(5, new int[]{17});
        SumConstraint f = new SumConstraint(5, new int[]{31, 30});
        SumConstraint g = new SumConstraint(11, new int[]{27, 26});
        SumConstraint h = new SumConstraint(0, new int[]{22, 23, 24, 25});
        return new SumConstraint[]{a, b, c, d, e, f, g, h};
    }
    
}
