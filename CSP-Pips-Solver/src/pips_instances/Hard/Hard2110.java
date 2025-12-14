package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.UnequalsConstraint;
import model.SumConstraint;
import model.SmallerConstraint;

public class Hard2110 extends PipsProblem {

    public Hard2110(){

        super(16, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}, 
                          {12, 13}, {13, 14}, {14, 15},
                          {16, 17}, {17, 18}, {18, 19}, 
                          {20, 21}, {21, 22}, {22, 23}, {23, 24}, {24, 25}, 
                          {26, 27}, {27, 28}, {28, 29}, {29, 30}, {30, 31}, 
                          {0, 8}, {2, 9}, {5, 10}, {7, 11}, 
                          {9, 12}, {10, 15}, 
                          {12, 16}, {13, 17}, {14, 18}, {15, 19}, 
                          {16, 21}, {17, 22}, {18, 23}, {19, 24},
                          {20, 26}, {21, 27}, {22, 28}, {23, 29}, {24, 30}, {25, 31}},
              new int[][] {{4, 4}, {6, 3}, {0, 1}, {3, 4}, {1, 6}, 
                           {2, 4}, {4, 6}, {2, 0}, {5, 6}, {1, 1}, 
                           {5, 3}, {3, 0}, {2, 2}, {2, 3}, {6, 2}, 
                           {5, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), 
              createUnequalsConstraints(), 
              createSumConstraints(), 
              createSmallerConstraints(), createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{4, 5});
        EqualsConstraint b = new EqualsConstraint(new int[]{25, 30, 31});
        EqualsConstraint c = new EqualsConstraint(new int[]{22, 23, 28, 29});
        return new EqualsConstraint[]{a, b, c};
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{12, 13, 16, 17});
        return new UnequalsConstraint[]{a};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(12, new int[]{0, 1});
        SumConstraint b = new SumConstraint(4, new int[]{2, 3});
        SumConstraint c = new SumConstraint(1, new int[]{10});
        SumConstraint d = new SumConstraint(1, new int[]{18});
        SumConstraint e = new SumConstraint(0, new int[]{14, 15, 19});
        SumConstraint f = new SumConstraint(18, new int[]{20, 21, 27});
        SumConstraint g = new SumConstraint(3, new int[]{24});
        return new SumConstraint[]{a, b, c, d, e, f, g};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{8});
        SmallerConstraint b = new SmallerConstraint(3, new int[]{11});
        return new SmallerConstraint[]{a, b};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(4, new int[]{26});
        LargerConstraint b = new LargerConstraint(9, new int[]{6, 7});
        return new LargerConstraint[]{a, b};
    }
    
}
