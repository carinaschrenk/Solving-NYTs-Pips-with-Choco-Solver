package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;
import model.SmallerConstraint;

public class Hard2310 extends PipsProblem {

    public Hard2310(){

        super(16, 
              new int[][]{{0, 1}, {2, 3}, 
                          {4, 5}, {5, 6}, {6, 7}, {7, 8}, {8, 9}, {9, 10}, {10, 11}, 
                          {12, 13}, {13, 14}, {14, 15}, {15, 16}, {16, 17}, {17, 18}, {18, 19}, 
                          {20, 21}, {21, 22}, {22, 23}, {23, 24}, {24, 25}, 
                          {26, 27}, {27, 28}, {28, 29}, 
                          {30, 31}, 
                          {0, 5}, {1, 6}, {2, 9}, {3, 10},
                          {4, 12}, {5, 13}, {6, 14}, {7, 15}, {8, 16}, {9, 17}, {10, 18}, {11, 19}, 
                          {13, 20}, {14, 21}, {15, 22}, {16, 23}, {17, 24}, {18, 25},
                          {21, 26}, {22, 27}, {23, 28}, {24, 29}, 
                          {27, 30}, {28, 31}},
              new int[][] {{0, 0}, {2, 0}, {0, 3}, {1, 1}, {1, 4}, 
                           {1, 5}, {2, 3}, {2, 5}, {6, 2}, {3, 3}, 
                           {3, 4}, {3, 6}, {4, 4}, {6, 4}, {5, 5}, 
                           {6, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), 
              null, 
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1, 5, 6, 13, 14});
        EqualsConstraint b = new EqualsConstraint(new int[]{20, 21});
        EqualsConstraint c = new EqualsConstraint(new int[]{24, 25, 29});
        return new EqualsConstraint[]{a, b, c};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(2, new int[]{4});
        SumConstraint b = new SumConstraint(26, new int[]{15, 16, 17, 22, 23});
        SumConstraint c = new SumConstraint(24, new int[]{10, 11, 18, 19});
        SumConstraint d = new SumConstraint(1, new int[]{27, 28, 30, 31});
        return new SumConstraint[]{a, b, c, d};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{3});
        SmallerConstraint b = new SmallerConstraint(7, new int[]{2, 7, 8, 9});
        return new SmallerConstraint[]{a, b};
    }
    
}
