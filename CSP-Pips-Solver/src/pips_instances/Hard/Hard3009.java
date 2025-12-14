package pips_instances.Hard;

import model.PipsProblem;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard3009 extends PipsProblem {

    public Hard3009(){

        super(14, 
              new int[][]{ {10, 11}, {11, 12}, {12, 13}, {13, 14}, {14, 15}, {15, 16}, 
                           {17, 18}, {18, 19}, {19, 20}, {20, 21}, {21, 22}, {22, 23},
                           {26, 27},
                           {2, 4}, {3, 6},
                           {4, 7}, {6, 8},
                           {7, 10}, {8, 12}, {9, 16},
                           {10, 17}, {11, 18}, {12, 19}, {13, 20}, {14, 21}, {15, 22}, {16, 23},
                           {17, 24}, {19, 25}, {21, 26}, {22, 27}, 
                           {0, 2}, {1, 3}, 
                           {4, 5}, {5, 6}},
              new int[][] {{6, 1}, {3,5}, {3,0}, {6,5}, {5, 1}, 
                           {2, 0}, {2, 1}, {0, 0}, {1, 1}, {2, 2},
                           {3,3}, {4, 4}, {5, 5}, {6,6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), createSmallerConstraints(),
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{6, 8});
        EqualsConstraint b = new EqualsConstraint(new int[]{4, 7});
        EqualsConstraint c = new EqualsConstraint(new int[]{11, 12});
        return new EqualsConstraint[]{a, b, c};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(11, new int[]{0, 2});
        SumConstraint b = new SumConstraint(8, new int[]{1, 3});
        SumConstraint c = new SumConstraint(6, new int[]{5});
        SumConstraint d = new SumConstraint(5, new int[]{17});
        SumConstraint e = new SumConstraint(3, new int[]{24});
        SumConstraint f = new SumConstraint(17, new int[]{14, 15, 21});
        SumConstraint g = new SumConstraint(0, new int[]{9});
        SumConstraint h = new SumConstraint(3, new int[]{26});
        SumConstraint j = new SumConstraint(2, new int[]{16, 22, 23});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, j};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(3, new int[]{10});
        LargerConstraint b = new LargerConstraint(4, new int[]{20});
        return new LargerConstraint[]{a, b};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(5, new int[]{18, 19});
        SmallerConstraint b = new SmallerConstraint(4, new int[]{25});
        return new SmallerConstraint[]{a, b};
    }
    
}
