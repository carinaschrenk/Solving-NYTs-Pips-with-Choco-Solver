package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.EqualsConstraint;
import model.SmallerConstraint;
import model.LargerConstraint;

public class Easy0610 extends PipsProblem {

    public Easy0610(){

        super(4, 
              new int[][]{{0, 1}, 
                          {1, 2}, {2, 3}, {3, 4},
                          {5, 6}, {6, 7},
                          {2, 5}, {3, 6}, {4, 7}}, 
              new int[][] {{1, 6}, {4, 3}, {2, 5}, {5, 5}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), 
              createSmallerConstraints(), createLargerConstraints());
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(7, new int[]{0, 1});
        return new SumConstraint[]{a}; 
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{5, 6});
        return new EqualsConstraint[]{a};
    } 

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(9, new int[]{4, 7});
        return new LargerConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(5, new int[]{2, 3});
        return new SmallerConstraint[]{a};
    }
    
}
