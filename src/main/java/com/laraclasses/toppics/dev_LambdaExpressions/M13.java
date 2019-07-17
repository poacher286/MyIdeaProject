package com.laraclasses.toppics.dev_LambdaExpressions;

@FunctionalInterface
        //Annotation name @FunctionalInterface--optional--if only one interface
interface A13 {
    int sum(int i, int j); //return type
}

public class M13 {

    public static void main(String[] args) {
        A13 a1 = (i, j) -> i + j;
        int i = a1.sum(10, 25); //supply value to test method
        System.out.println("done with : " + i);
    }
}



/*


done with: 35


single interface methods--lambda expression
@annotation are used to describe syntactical description

*/