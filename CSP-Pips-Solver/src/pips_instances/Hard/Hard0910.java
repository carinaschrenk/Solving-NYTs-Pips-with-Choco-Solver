package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard0910 extends PipsProblem {

    public Hard0910(){

        super(16, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {8, 9}, {9, 10}, {10, 11}, {11, 12}, {12, 13},
                          {14, 15}, {15, 16}, {16, 17}, {17, 18}, {18, 19}, 
                          {20, 21}, {21, 22}, {22, 23}, {23, 24}, {24, 25}, 
                          {26, 27}, {27, 28}, {28, 29}, {29, 30}, {30, 31},
                          {0, 4}, {3, 5},
                          {4, 6}, {5, 7}, 
                          {6, 9}, {7, 12}, 
                          {8, 14}, {9, 15}, {10, 16}, {11, 17}, {12, 18}, {13, 19}, 
                          {14, 20}, {15, 21}, {16, 22}, {17, 23}, {18, 24}, {19, 25}, 
                          {20, 26}, {21, 27}, {22, 28}, {23, 29}, {24, 30}, {25, 31}},
              new int[][] {{6, 3}, {0, 0}, {1, 2}, {5,5}, {3,2}, 
                           {1, 1}, {3,1}, {4,1}, {6, 0}, {6, 1}, 
                           {4, 5}, {3,3}, {0,4}, {5,1}, {0,1}, 
                           {2, 5}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{5, 7, 9, 10, 11, 12, 13, 18});
        EqualsConstraint b = new EqualsConstraint(new int[]{14, 20, 26, 27});
        EqualsConstraint c = new EqualsConstraint(new int[]{16, 22, 28});
        EqualsConstraint d = new EqualsConstraint(new int[]{19, 25});
        EqualsConstraint e = new EqualsConstraint(new int[]{23, 24, 29, 30, 31});
        return new EqualsConstraint[]{a, b, c, d, e};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{0, 1, 2, 3});
        SumConstraint b = new SumConstraint(12, new int[]{4, 6});
        SumConstraint c = new SumConstraint(0, new int[]{21});
        return new SumConstraint[]{a, b, c};
    }
    
}
