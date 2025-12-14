package pips_instances.Hard;

import model.PipsProblem;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard0210 extends PipsProblem {

    public Hard0210(){

        super(14, 
              new int[][]{ {0, 2},
                           {1, 2}, {2, 3},
                           {4, 5}, {5, 6}, {6, 7}, {7, 8}, 
                           {9, 10}, {10, 11}, {11, 12}, {12, 13}, 
                           {14, 15}, {15, 16}, {16, 17}, {17, 18}, {18, 19}, {19, 20},
                           {23, 24}, {24, 25}, {25, 26}, {26, 27}, 
                           {1, 5}, {2, 6}, {3, 7}, 
                           {4, 9}, {5, 10}, {6, 11}, {7, 12}, {8, 13}, 
                           {9, 15}, {10, 16}, {11, 17}, {12, 18}, {13, 19}, 
                           {17, 21}, {21, 22}, {22, 25}},
              new int[][] {{5, 2}, {2,1}, {5,4}, {1,1}, {3,3}, 
                           {4, 6}, {3, 2}, {3, 4}, {0, 0}, {6, 1}, 
                           {1, 0}, {4, 2}, {1, 3}, {5, 5}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), createSmallerConstraints(),
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 2, 6, 11});
        EqualsConstraint b = new EqualsConstraint(new int[]{22, 24, 25, 26});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{3});
        SumConstraint b = new SumConstraint(3, new int[]{4, 5});
        SumConstraint c = new SumConstraint(1, new int[]{7, 8});
        SumConstraint d = new SumConstraint(1, new int[]{13});
        SumConstraint e = new SumConstraint(3, new int[]{15, 16});
        SumConstraint f = new SumConstraint(3, new int[]{9, 10});
        SumConstraint g = new SumConstraint(4, new int[]{17});
        SumConstraint h = new SumConstraint(4, new int[]{14});
        SumConstraint j = new SumConstraint(12, new int[]{18, 19});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, j};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(3, new int[]{0});
        return new LargerConstraint[]{a};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(4, new int[]{20});
        SmallerConstraint b = new SmallerConstraint(3, new int[]{21});
        SmallerConstraint c = new SmallerConstraint(3, new int[]{23});
        SmallerConstraint d = new SmallerConstraint(2, new int[]{27});
        return new SmallerConstraint[]{a, b, c, d};
    }
    
}
