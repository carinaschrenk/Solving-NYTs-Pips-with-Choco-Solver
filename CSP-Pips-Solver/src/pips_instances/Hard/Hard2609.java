package pips_instances.Hard;

import model.PipsProblem;
import model.UnequalsConstraint;
import model.SmallerConstraint;
import model.EqualsConstraint;
import model.SumConstraint;

public class Hard2609 extends PipsProblem {

    public Hard2609(){

        super(11, 
              new int[][]{{0, 1}, 
                           {3, 4}, {4, 5},
                           {6, 7}, {7, 8}, {9, 8}, {10, 9}, 
                           {11, 12}, {12, 13}, {13, 14}, {14, 15}, 
                           {16, 17}, {17, 18}, {18, 19}, {19, 20},
                           {0, 3}, {1, 4}, 
                           {2, 6}, {3, 8}, {4, 9}, {5, 10}, 
                           {6, 11}, {7, 12}, {8, 13}, {9, 14}, {10, 15}, 
                           {11, 16}, {12, 17}, {13, 18}, {14, 19}, {15, 20},
                           {17, 21}},
              new int[][] {{2, 0}, {0, 0}, {4,3}, {5,3}, {5, 5}, 
                           {2, 6}, {2, 5}, {4, 1}, {0, 1}, {2, 4},
                           {0, 6}}, 
              new int[]{0, 1, 2, 3, 4, 5, 6},
              createEqualsConstraints(), createUnequalsConstraints(),
              createSumConstraints(), createSmallerConstraints(),
              null);
    }

    static EqualsConstraint[] createEqualsConstraints(){
        EqualsConstraint a = new EqualsConstraint(new int[]{1, 4, 5, 10});
        EqualsConstraint b = new EqualsConstraint(new int[]{16, 17, 18});
        return new EqualsConstraint[]{a, b};
    } 

    static UnequalsConstraint[] createUnequalsConstraints(){
        UnequalsConstraint a = new UnequalsConstraint(new int[]{11, 12});
        return new UnequalsConstraint[]{a};
    } 

    static SumConstraint[] createSumConstraints(){
        SumConstraint a = new SumConstraint(22, new int[]{14, 15, 19, 20});
        SumConstraint b = new SumConstraint(2, new int[]{6});
        SumConstraint c = new SumConstraint(2, new int[]{21});
        return new SumConstraint[]{a, b, c};
    }

    static SmallerConstraint[] createSmallerConstraints(){
        SmallerConstraint a = new SmallerConstraint(2, new int[]{0});
        SmallerConstraint b = new SmallerConstraint(2, new int[]{3});
        SmallerConstraint c = new SmallerConstraint(2, new int[]{13});
        return new SmallerConstraint[]{a, b, c};
    }
    
}
