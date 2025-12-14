package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;
import model.LargerConstraint;

public class Hard1510 extends PipsProblem {

    public Hard1510(){

        super(15, 
              new int[][]{{0, 1}, {1, 2},  
                          {5, 6}, {6, 7},
                          {10, 11}, {11, 12}, 
                          {15, 16}, {16, 17}, 
                          {0, 3}, {2, 4}, 
                          {3, 5}, {4, 7}, 
                          {5, 8}, 
                          {8, 9},
                          {10, 13}, {12, 14}, 
                          {13, 15}, {14, 17}, 
                          {15, 18}, 
                          {18, 19},  
                          {20, 21}, {21, 22}, {22, 23}, 
                          {24, 25}, 
                          {24, 26}, {26, 27}, {27, 28}, {28, 29}},
              new int[][] {{6, 0}, {1, 4}, {4, 2}, {4, 6}, {0, 2}, 
                           {4, 5}, {0, 0}, {2, 3}, {5, 1}, {1, 3}, 
                           {0, 1}, {0, 3}, {2, 5}, {3, 3}, {2, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{24, 26});
        EqualsConstraint b = new EqualsConstraint(new int[]{27, 28, 29});
        return new EqualsConstraint[]{a, b};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(8, new int[]{0, 3});
        SumConstraint b = new SumConstraint(2, new int[]{1, 2});
        SumConstraint c = new SumConstraint(10, new int[]{5, 6});
        SumConstraint d = new SumConstraint(4, new int[]{4, 7});
        SumConstraint e = new SumConstraint(4, new int[]{8});
        SumConstraint f = new SumConstraint(9, new int[]{10, 13});
        SumConstraint g = new SumConstraint(2, new int[]{11, 12});
        SumConstraint h = new SumConstraint(1, new int[]{14, 17});
        SumConstraint i = new SumConstraint(3, new int[]{16});
        SumConstraint j = new SumConstraint(12, new int[]{15, 18});
        SumConstraint k = new SumConstraint(2, new int[]{19});
        SumConstraint l = new SumConstraint(0, new int[]{21, 22, 23});
        SumConstraint m = new SumConstraint(0, new int[]{25});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(3, new int[]{20});
        LargerConstraint b = new LargerConstraint(1, new int[]{9});
        return new LargerConstraint[]{a, b};
    }
    
}
