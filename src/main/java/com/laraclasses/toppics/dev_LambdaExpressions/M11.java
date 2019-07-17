package com.laraclasses.toppics.dev_LambdaExpressions;

//A11 is functional interface
interface A11 {
    int test(); //return type
}

public class M11 {

    public static void main(String[] args) {
        A11 a1 = () -> {
            System.out.println("from test");
            return 200;
        };
        int i = a1.test(); //supply value to test method
        System.out.println("done with : " + i);
    }
}

/*

from test:
done with: 200
done!

single interface methods--lambda expression

*/