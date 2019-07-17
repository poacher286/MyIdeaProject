package com.laraclasses.toppics.dev_LambdaExpressions;

@FunctionalInterface
        //annotation name @FunctionalInterface--optional--if only one interface
interface A14 {
    int sum(int i, int j); //unexpected @FunctionalInterface annotation--2 methods are there

//    int sub(int i, int j); // CTE
}

public class M14 {
    public static void main(String[] args) {
        A14 a1 = (i, j) -> i + j;
        int i = a1.sum(10, 25); //supply value to test method
        System.out.println("done with : " + i);
    }
}



/*


CTE


single interface methods--lambda expression
@annotation are used to describe syntactical description

*/