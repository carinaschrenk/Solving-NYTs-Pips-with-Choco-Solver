package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Medium0810 extends PipsProblem {

    public Medium0810(){

        super(11, 
              new int[][]{{1, 2}, {2, 3},
                          {4, 5}, {5, 6}, 
                          {7, 8}, {8, 9}, {9, 10}, {10, 11},
                          {12, 13}, {13, 14}, {14, 15}, {15, 16}, {16, 17}, {17, 18},
                          {19, 20}, {20, 21}, 
                          {0, 2}, 
                          {1, 4}, {2, 5}, {3, 6}, 
                          {4, 8}, {5, 9}, {6, 10}, 
                          {7, 13}, {8, 14}, {9, 15}, {10, 16}, {11, 17}, 
                          {14, 19}, {15, 20}, {16, 21}}, 
              new int[][] {{5, 1}, {6, 2}, {6, 5}, {0, 6}, {6, 3}, 
                           {3, 5}, {4, 5}, {6, 1}, {1, 0}, {0, 4}, 
                           {4, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(6, new int[]{0});
        SumConstraint b = new SumConstraint(3, new int[]{1, 2, 5});
        SumConstraint c = new SumConstraint(2, new int[]{12});
        SumConstraint d = new SumConstraint(12, new int[]{7, 13});
        SumConstraint e = new SumConstraint(0, new int[]{4, 8, 14});
        SumConstraint f = new SumConstraint(6, new int[]{6, 10});
        SumConstraint g = new SumConstraint(18, new int[]{11, 16, 17});
        SumConstraint h = new SumConstraint(5, new int[]{18});
        return new SumConstraint[]{a, b, c, d, e, f, g, h};
    }  

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{9, 15});
        EqualsConstraint b = new EqualsConstraint(new int[]{19, 20, 21});
        return new EqualsConstraint[]{a, b};
    }
    
}
