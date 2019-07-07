package com.laraclasses.toppics.dev_LambdaExpressions;

//A3 is functional interface
interface A3 {
    void test();
}

public class M3 {

    public static void main(String[] args) {
        //local inner class we can use in the main method
        class B implements A3 {
            public void test() {
                System.out.println("from test");
            }
        }
        B b1 = new B();
        b1.test();
        System.out.println("done!");
    }
}



/*

from test
done!


*/