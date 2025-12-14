package pips_instances.Hard;

import model.PipsProblem;
import model.EqualsConstraint;
import model.LargerConstraint;
import model.SumConstraint;

public class Hard0610 extends PipsProblem {

    public Hard0610(){

        super(6, 
              new int[][]{{0, 1}, {1, 2},
                          {4, 5}, {5, 6},
                          {9, 10}, {10, 11}, 
                          {0, 3}, 
                          {3, 4}, 
                          {4, 7}, {6, 8}, 
                          {7, 9}, {8, 11}}, 
              new int[][] {{2, 0}, {5,1}, {6,0}, {5,6}, {4, 6}, 
                           {6, 2}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), null,
              createSumConstraints(), null,
              createLargerConstraints());
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{0, 1});
        EqualsConstraint b = new EqualsConstraint(new int[]{9, 10});
        return new EqualsConstraint[]{a, b};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(6, new int[]{2});
        SumConstraint b = new SumConstraint(6, new int[]{5, 6});
        SumConstraint c = new SumConstraint(6, new int[]{3, 4, 7});
        return new SumConstraint[]{a, b, c};
    }

    static LargerConstraint[] createLargerConstraints(){
        LargerConstraint a = new LargerConstraint(6, new int[]{8, 11});
        return new LargerConstraint[]{a};
    }
    
}
