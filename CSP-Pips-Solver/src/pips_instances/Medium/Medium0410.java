package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Medium0410 extends PipsProblem {

    public Medium0410(){

        super(8, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5},
                          {6, 7}, {7, 8}, {8, 9}, {9, 10}, {10, 11}, 
                          {12, 13}, 
                          {14, 15},
                          {0, 6}, {1, 7}, {2, 8}, {3, 9}, {4, 10}, {5, 11},
                          {8, 12}, {9, 13}, 
                          {12, 14}, {13, 15}}, 
              new int[][] {{2, 0}, {4, 5}, {0, 5}, {6, 6}, {0, 1}, 
                           {0, 0}, {2, 1}, {4, 2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(4, new int[]{6});
        return new SumConstraint[]{a};
    }  

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{3, 4, 5});
        EqualsConstraint b = new EqualsConstraint(new int[]{9, 10});
        EqualsConstraint c = new EqualsConstraint(new int[]{13, 15});
        EqualsConstraint d = new EqualsConstraint(new int[]{0, 1, 2, 8, 12});
        return new EqualsConstraint[]{a, b, c, d};
    }
    
}
