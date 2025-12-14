package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard1710 extends PipsProblem {

    public Hard1710(){

        super(16, 
              new int[][]{{1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7},
                          {9, 10}, 
                          {11, 12}, {12, 13}, {13, 14}, {14, 15}, {15, 16}, {16, 17}, 
                          {18, 19}, {19, 20}, {20, 21}, {21, 22}, {22, 23},  
                          {24, 25}, {26, 27}, 
                          {28, 29}, {30, 31},
                          {0, 1}, 
                          {1, 4}, {2, 5}, {3, 6},
                          {4, 9}, {5, 10}, 
                          {8, 11}, {9, 16}, {10, 17}, 
                          {12, 18}, {13, 19}, {14, 20}, {15, 21}, {16, 22}, {17, 23}, 
                          {18, 24}, {19, 25}, {22, 26}, {23, 27}, 
                          {24, 28}, {25, 29}, {26, 30}, {27, 31}},
              new int[][] {{0, 3}, {2, 2}, {0, 4}, {2, 3}, {6, 6}, 
                           {2, 1}, {6, 1}, {0, 2}, {1, 0}, {3, 5}, 
                           {4, 6}, {5, 2}, {4, 4}, {3, 4}, {6, 5}, 
                           {1, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 4, 9, 16, 22});
        EqualsConstraint b = new EqualsConstraint(new int[]{10, 17, 23});
        EqualsConstraint c = new EqualsConstraint(new int[]{27, 30, 31});
        return new EqualsConstraint[]{a, b, c};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{0});
        SumConstraint b = new SumConstraint(10, new int[]{2, 5});
        SumConstraint c = new SumConstraint(4, new int[]{3, 6});
        SumConstraint d = new SumConstraint(0, new int[]{7});
        SumConstraint e = new SumConstraint(0, new int[]{15, 21});
        SumConstraint f = new SumConstraint(3, new int[]{13, 14, 19});
        SumConstraint g = new SumConstraint(2, new int[]{25});
        SumConstraint h = new SumConstraint(30, new int[]{11, 12, 18, 24, 28});
        return new SumConstraint[]{a, b, c, d, e, f, g, h};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{8});
        return new LargerConstraint[]{a};
    }
    
}
