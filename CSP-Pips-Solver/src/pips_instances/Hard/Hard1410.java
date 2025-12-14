package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.UnequalsConstraint;
import model.SumConstraint;
import model.SmallerConstraint;

public class Hard1410 extends PipsProblem {

    public Hard1410(){

        super(16, 
              new int[][]{{0, 1}, 
                          {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}, {7, 8},
                          {10, 11}, {11, 12}, {12, 13}, {13, 14}, {14, 15},
                          {16, 17}, {18, 19}, {19, 20}, {20, 21}, {21, 22}, {22, 23},
                          {24, 25}, {26, 27},
                          {28, 29}, {30, 31}, 
                          {0, 3}, {1, 4}, 
                          {2, 9}, {4, 10}, {5, 11}, {6, 12}, {7, 13}, {8, 14}, 
                          {9, 17}, {10, 18}, {11, 19}, {12, 20}, {13, 21}, {14, 22}, {15, 23}, 
                          {18, 24}, {19, 25}, {22, 26}, {23, 27}, 
                          {24, 28}, {25, 29}, {26, 30}, {27, 31}},
              new int[][] {{6, 5}, {1, 0}, {0, 3}, {6, 4}, {6, 6}, 
                           {1, 1}, {4, 3}, {2, 1}, {4, 2}, {4, 5}, 
                           {5, 2}, {2, 0}, {1, 5}, {6, 3}, {6, 2}, 
                           {4, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), 
              createUnequalsConstraints(), 
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1});
        return new EqualsConstraint[]{a};
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{11, 12});
        return new UnequalsConstraint[]{a};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(18, new int[]{9, 16, 17});
        SumConstraint b = new SumConstraint(6, new int[]{2, 3});
        SumConstraint c = new SumConstraint(12, new int[]{4, 5});
        SumConstraint d = new SumConstraint(5, new int[]{6});
        SumConstraint e = new SumConstraint(6, new int[]{7, 13, 21});
        SumConstraint f = new SumConstraint(10, new int[]{8, 14});
        SumConstraint g = new SumConstraint(10, new int[]{19, 20});
        SumConstraint h = new SumConstraint(4, new int[]{24, 25, 28, 29});
        SumConstraint i = new SumConstraint(0, new int[]{22, 23, 26, 27});
        return new SumConstraint[]{a, b, c, d, e, f, g, h, i};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{31});
        SmallerConstraint b = new SmallerConstraint(3, new int[]{30});
        return new SmallerConstraint[]{a, b};
    }
    
}
