package pips_instances.Easy;

import model.PipsProblem;
import model.SumConstraint;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.EqualsConstraint;

public class Easy0210 extends PipsProblem {

    public Easy0210(){

        super(6, 
              new int[][]{{0, 1}, {1, 2}, {2, 3}, 
                          {4, 5}, {5, 6}, 
                          {9, 10}, {10, 11},
                          {1, 4}, {2, 5}, {3, 6},
                          {4, 7}, {6, 8}, 
                          {7, 9}, {8, 11}}, 
              new int[][] {{2, 4}, {2,0}, {2, 6}, {5,1}, {3,3}, {1,6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(2, new int[]{6});
        SumConstraint b = new SumConstraint(12, new int[]{8,11});
        SumConstraint c = new SumConstraint(1, new int[]{9});
        return new SumConstraint[]{a, b, c}; 
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{2, 3});
        return new EqualsConstraint[]{a};
    } 

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{1, 4, 7});
        return new UnequalsConstraint[]{a};
    } 

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{0});
        return new SmallerConstraint[]{a};
    }
    
}
