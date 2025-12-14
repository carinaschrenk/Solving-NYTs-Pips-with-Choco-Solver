package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;

public class Easy3008 extends PipsProblem {

    public Easy3008(){

        super(5, 
              new int[][] {{0,1}, {1, 2}, {2,3}, {3, 4}, {4,5}, {5,6}, {6,7}, {7, 8}, {6, 9}, {8, 9}, {9, 0}}, 
              new int[][]{{3, 1}, {5, 5}, {2, 2}, {6,0}, {4, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint one = new SumConstraint(1, new int[]{0, 1});
        SumConstraint seven = new SumConstraint(7, new int[]{8, 9});
        SumConstraint sixteen = new SumConstraint(16, new int[]{2, 3, 4});
        return new SumConstraint[]{one, seven, sixteen};
    }
    
}
