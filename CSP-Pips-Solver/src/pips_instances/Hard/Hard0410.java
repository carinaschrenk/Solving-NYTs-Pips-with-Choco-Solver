package pips_instances.Hard;

import model.PipsProblem;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard0410 extends PipsProblem {

    public Hard0410(){

        super(8, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                           {4, 5}, {5,6}, {6, 7}, 
                           {9, 8},  
                           {10, 11}, {11, 12}, {12, 13}, 
                           {0, 4}, {1, 5}, {2, 6}, {3, 7},
                           {5, 8}, {6, 9}, 
                           {11, 8}, {12, 9}, 
                           {10, 14}, {13, 15}},
              new int[][] {{4, 4}, {4, 1}, {3, 1}, {1, 0}, {1, 1}, 
                           {2, 1}, {0, 0}, {3, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), createSmallerConstraints(),
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 4});
        return new EqualsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{1});
        SumConstraint b = new SumConstraint(0, new int[]{6});
        SumConstraint c = new SumConstraint(0, new int[]{10});
        SumConstraint d = new SumConstraint(3, new int[]{5});
        SumConstraint e = new SumConstraint(3, new int[]{13, 15});
        SumConstraint f = new SumConstraint(4, new int[]{8, 9, 11, 12});
        return new SumConstraint[]{a, b, c, d, e, f};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(3, new int[]{2, 3});
        return new SmallerConstraint[]{a};
    }
    
}
