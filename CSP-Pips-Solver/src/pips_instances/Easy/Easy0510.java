package pips_instances.Easy;

import model.EqualsConstraint;
import model.PipsProblem;
import model.SmallerConstraint;
import model.SumConstraint;

public class Easy0510 extends PipsProblem {

    public Easy0510(){

        super(4, 
              new int[][] {{0,1}, 
                           {2,3}, {3, 4}, 
                           {5, 6}, {6, 7}, 
                           {0, 2}, {1, 3}, 
                           {2, 5}, {3, 6}, {4, 7}}, 
              new int[][]{{5, 1}, {1, 4}, {4, 2}, {1, 3}},
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(8, new int[]{0, 2});
        return new SumConstraint[]{a};
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{5, 6, 7});
        return new EqualsConstraint[]{a};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(5, new int[]{4});
        return new SmallerConstraint[]{a};
    }
    
}
