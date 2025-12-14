package pips_instances.Medium;

import model.EqualsConstraint;
import model.PipsProblem;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.SumConstraint;

public class Medium2508 extends PipsProblem {

    public Medium2508(){

        super(6, 
              new int[][]{{0, 1}, {2, 3}, {4, 5}, {5, 6},
                          {7, 8}, {8, 9}, {9, 10}, {10, 11}, 
                          {1, 2}, {4, 7}, {5, 8},
                          {6, 9}, {8, 11}, {2, 6}}, 
              new int[][] {{6, 0}, {4,1}, {5,5}, {5,2}, {3, 4}, {5, 0}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), 
              createSmallerConstraints(), null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{4, 7});
        EqualsConstraint b = new EqualsConstraint(new int[]{9, 10});
        return new EqualsConstraint[]{a, b}; 
    }

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{1, 2});
        return new UnequalsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(0, new int[]{5, 6});
        return new SumConstraint[]{a};
    }  

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{3});
        return new SmallerConstraint[]{a};
    }
    
}
