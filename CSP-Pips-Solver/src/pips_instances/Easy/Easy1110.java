package pips_instances.Easy;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SumConstraint;

public class Easy1110 extends PipsProblem {

    public Easy1110(){

        super(5, 
              new int[][] {{0,1}, {1, 2}, {2,3}, {3, 4}, {4,5}, {5,6}, {6,7}, {7, 8}, {8, 9}}, 
              new int[][]{{1, 1}, {3, 1}, {6, 6}, {4, 2}, {4, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{3, 4, 5});
        return new EqualsConstraint[]{a};
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint one = new SumConstraint(12, new int[]{0, 1});
        SumConstraint seven = new SumConstraint(3, new int[]{6, 7, 8});
        SumConstraint sixteen = new SumConstraint(3, new int[]{9});
        return new SumConstraint[]{one, seven, sixteen};
    }
    
}
