package com.laraclasses.toppics.dev_LambdaExpressions;

//A9 is functional interface
interface A9 {
    void test(int i, String s1); //test method is taking some argument
}

public class M9 {

    public static void main(String[] args) {
        A9 a1 = (x, y) -> {
            System.out.println("from test :" + x);
            System.out.println("from test :" + y);
        };
        a1.test(10, "abc"); //supply value to test method
        System.out.println("done!");
    }
}



/*

from test: 10
from test: abc
done!

single interface methods--lambda expression

*/