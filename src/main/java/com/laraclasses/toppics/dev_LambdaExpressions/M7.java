package com.laraclasses.toppics.dev_LambdaExpressions;

//A7 is functional interface
interface A7 {
    void test(int i); //test method is taking some argument
}

class M7 {
    public static void main(String[] args) {
        A7 a1 = (int x) -> System.out.println("from test :" + x);  //x as identifier
        a1.test(10); //supply value to test method
        System.out.println("done!");
    }
}



/*

from test
done!

single interface methods--lambda expression

*/