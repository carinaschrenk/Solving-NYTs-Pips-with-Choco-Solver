package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard3008 extends PipsProblem {

    public Hard3008(){

        super(13, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, 
                          {8, 9}, {9, 10}, {10, 11}, {11, 12}, {12, 13}, {13, 14}, 
                          {19, 20}, {20, 21}, {21, 22}, {22, 23}, {23, 24}, {24, 25},
                          {0, 5}, {2, 6}, {4, 7}, 
                          {5, 9}, {6, 11}, {7, 13}, 
                          {8, 15}, {10, 16}, {12, 17}, {14, 18}, 
                          {15, 19}, {16, 21}, {17, 23}, {18, 25}}, 
              new int[][] {{2,1}, {6,0}, {0,4}, {2,2}, {5, 1}, 
                           {3, 6}, {3, 2}, {2, 6}, {0, 3}, {6, 4}, 
                           {4, 2}, {2, 0}, {3, 4}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{8, 9, 10, 11, 12, 13, 14});
        EqualsConstraint b = new EqualsConstraint(new int[]{17, 23, 24});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(11, new int[]{0, 1});
        SumConstraint b = new SumConstraint(1, new int[]{2});
        SumConstraint c = new SumConstraint(4, new int[]{3});
        SumConstraint d = new SumConstraint(12, new int[]{4, 7});
        SumConstraint e = new SumConstraint(4, new int[]{6});
        SumConstraint f = new SumConstraint(4, new int[]{16});
        SumConstraint g = new SumConstraint(7, new int[]{15, 19});
        SumConstraint h = new SumConstraint(0, new int[]{20, 21, 22});
        SumConstraint i = new SumConstraint(4, new int[]{18, 25});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, i};
    }
    
}
