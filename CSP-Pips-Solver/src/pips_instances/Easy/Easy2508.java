package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;

public class Easy2508 extends PipsProblem {

    public Easy2508(){

        super(4, 
              new int[][] {{0, 1}, {1, 2}, {3,4}, {4,5}, {5,6}, {6, 7}, {0, 3}, {1, 4}, {2, 5}}, 
              new int[][]{{3, 5}, {5, 2}, {5, 1}, {1, 1}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              null, null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint two = new SumConstraint(2, new int[]{0});
        SumConstraint three = new SumConstraint(3, new int[]{5, 6, 7});
        SumConstraint fifteen = new SumConstraint(15, new int[]{1, 3, 4});
        return new SumConstraint[]{two, three, fifteen};
    }
    
}
