package com.laraclasses.toppics.dev_LambdaExpressions;

//A8 is functional interface
interface A8 {
    void test(int i); //test method is taking some argument
}

public class M8 {

    public static void main(String[] args) {
        A8 a1 = (x) -> System.out.println("from test :" + x);  //x as identifier---removed data type as only one method is there
        a1.test(10); //supply value to test method
        System.out.println("done!");
    }
}

/*

from test
done!

single interface methods--lambda expression

*/