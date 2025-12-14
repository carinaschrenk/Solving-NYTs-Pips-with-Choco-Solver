package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.EqualsConstraint;

public class Easy2908 extends PipsProblem {

    public Easy2908(){

        super(4, 
              new int[][] {{0,2}, {1,2}, {3,4}, {4,5}, {5,6}, {6,7}, {1, 5}, {2, 6}}, 
              new int[][]{{3, 1}, {5, 0}, {5, 5}, {5, 4}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              null, null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint three = new SumConstraint(3, new int[]{2});
        SumConstraint four = new SumConstraint(4, new int[]{7});
        return new SumConstraint[]{three, four};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{3, 4, 5, 6});
        return new EqualsConstraint[]{a};
    }
    
}
