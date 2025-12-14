package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard2909 extends PipsProblem {

    public Hard2909(){

        super(16, 
              new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5},
                          {6, 7}, {7, 8},
                          {9, 10}, {10, 11}, 
                          {15, 16}, {16, 17}, {17, 18}, {18, 19}, {19, 20}, {20, 21}, 
                          {22, 23}, {23, 24}, 
                          {25, 26}, {26, 27}, {28, 29}, {30, 31},
                          {0, 3}, 
                          {2, 6}, {3, 7}, {4, 8},
                          {6, 9}, {7, 10}, {8, 11}, 
                          {10, 13},
                          {12, 15}, {13, 18}, {14, 21},  
                          {17, 22}, {18, 23}, {19, 24}, 
                          {22, 25}, {23, 26}, {24, 27},
                          {25, 29}, {27, 30}}, 
              new int[][] {{4, 4}, {6,1}, {5,5}, {5,3}, {4, 1}, 
                           {1, 1}, {0, 0}, {3, 1}, {4, 3}, {2, 5}, 
                           {4, 5}, {6, 6}, {0, 1}, {3, 3}, {5, 0},
                           {5, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 3, 4, 8});
        EqualsConstraint b = new EqualsConstraint(new int[]{10, 11, 13});
        EqualsConstraint c = new EqualsConstraint(new int[]{18, 19, 22, 23, 25, 26, 29});
        return new EqualsConstraint[]{a, b, c};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(6, new int[]{1, 2});
        SumConstraint b = new SumConstraint(0, new int[]{7});
        SumConstraint c = new SumConstraint(2, new int[]{6, 9});
        SumConstraint d = new SumConstraint(3, new int[]{15, 16, 17});
        SumConstraint e = new SumConstraint(0, new int[]{14, 20, 21});
        SumConstraint f = new SumConstraint(2, new int[]{24});
        SumConstraint g = new SumConstraint(18, new int[]{27, 30, 31});
        return new SumConstraint[]{a, b, c, d, e, f, g};
    }
    
}
