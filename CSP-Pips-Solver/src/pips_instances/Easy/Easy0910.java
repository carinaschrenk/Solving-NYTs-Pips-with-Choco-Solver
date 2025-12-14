package pips_instances.Easy;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Easy0910 extends PipsProblem {

    public Easy0910(){

        super(6, 
              new int[][] {{0,1}, {1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}, {7, 8},
                           {8,9}, {9,10}, {10,11}}, 
              new int[][]{{4, 4}, {6, 4}, {3, 5}, {1, 5}, {1, 4}, {6, 6}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1, 2});
        EqualsConstraint b = new EqualsConstraint(new int[]{5, 6});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(8, new int[]{7, 8});
        SumConstraint b = new SumConstraint(8, new int[]{3, 4});
        return new SumConstraint[]{a, b};
    }
    
}
