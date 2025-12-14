package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.UnequalsConstraint;
import model.SumConstraint;

public class Hard2709 extends PipsProblem {

    public Hard2709(){

        super(16, 
              new int[][]{{0, 3}, 
                          {1, 6}, {2, 7}, {3, 8}, {4, 9}, {5, 14}, 
                          {8, 15}, {9, 16}, {10, 17}, {11, 18}, {12, 19}, {13, 20}, 
                          {15, 21}, {16, 22}, {17, 23}, {18, 24}, {19, 25}, 
                          {21, 26}, {25, 27}, 
                          {26, 29}, {27, 31}, 
                          {1, 2}, {2, 3}, {3, 4}, 
                          {6, 7}, {7, 8}, {8, 9}, {9, 10}, {10, 11}, {11, 12}, {12, 13}, {13, 14}, 
                          {15, 16}, {16, 17}, {17, 18}, {18, 19}, {19, 20}, 
                          {21, 22}, {22, 23}, {23, 24}, {24, 25}, 
                          {28, 29}, {30, 31}},
              new int[][] {{1, 3}, {1, 2}, {0, 0}, {1,5}, {1,6}, 
                           {2,2}, {4,2}, {0,1}, {6, 2}, {6, 0}, 
                           {4, 4}, {3,5}, {3,3}, {4,3}, {0,2}, 
                           {1,1}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), 
              createUnequalsConstraints(), 
              createSumConstraints(), 
              null, null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 3, 4});
        EqualsConstraint b = new EqualsConstraint(new int[]{13, 14});
        EqualsConstraint c = new EqualsConstraint(new int[]{27, 31});
        return new EqualsConstraint[]{a, b, c};
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{8, 9, 10, 16, 17});
        return new UnequalsConstraint[]{a};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(1, new int[]{2});
        SumConstraint b = new SumConstraint(2, new int[]{7});
        SumConstraint c = new SumConstraint(5, new int[]{5});
        SumConstraint d = new SumConstraint(3, new int[]{11});
        SumConstraint e = new SumConstraint(4, new int[]{12});
        SumConstraint f = new SumConstraint(2, new int[]{15});
        SumConstraint g = new SumConstraint(0, new int[]{18, 19});
        SumConstraint h = new SumConstraint(2, new int[]{20});
        SumConstraint i = new SumConstraint(1, new int[]{21});
        SumConstraint j = new SumConstraint(4, new int[]{22});
        SumConstraint k = new SumConstraint(18, new int[]{23, 24, 25});
        SumConstraint l = new SumConstraint(3, new int[]{28});
        SumConstraint m = new SumConstraint(1, new int[]{26, 29});
        SumConstraint n = new SumConstraint(4, new int[]{30});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
    }
    
}
