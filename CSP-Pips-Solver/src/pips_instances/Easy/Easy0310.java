package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.EqualsConstraint;

public class Easy0310 extends PipsProblem {

    public Easy0310(){

        super(5, 
              new int[][] {{1,2}, {2, 3}, {3,4}, {4,5}, 
                           {6, 7}, {7,8}, 
                           {3, 0}, 
                           {2,6}, {3,7}, {4,8}, 
                           {6,9}}, 
              new int[][]{{0, 4}, {0,1}, {1, 5}, {2,4}, {1, 1}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{9});
        SumConstraint b = new SumConstraint(2, new int[]{1});
        return new SumConstraint[]{a,b};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 3});
        EqualsConstraint b = new EqualsConstraint(new int[]{4,6,7,8});
        return new EqualsConstraint[]{a, b};
    }
    
}
