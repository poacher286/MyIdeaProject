package com.laraclasses.toppics.dev_LambdaExpressions;

//A10 is functional interface
interface A10 {
    int test(); //return type
}

public class M10 {

    public static void main(String[] args) {
        A10 a1 = () -> 200; //compiler taking care of subclass and returning value
        int i = a1.test(); //supply value to test method
        System.out.println("done with : " + i);
    }
}



/*

from test: 10
from test: abc
done!

single interface methods--lambda expression

*/