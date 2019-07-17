package com.laraclasses.toppics.dev_LambdaExpressions;

//A12 is functional interface
interface A12 {
    int sum(int i, int j); //return type
}

public class M12 {

    public static void main(String[] args) {
        A12 a1 = (i, j) -> i + j;
        int i = a1.sum(10, 25); //supply value to test method
        System.out.println("done with : " + i);
    }
}
/*
done with: 35


single interface methods--lambda expression

*/