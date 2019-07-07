package com.laraclasses.toppics.dev_LambdaExpressions;

//A2 is functional interface
interface A2 {
    void test();
}

public class M2 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.test();
        System.out.println("done!");
    }

    //static inner class we can use in the main method
    static class B implements A2 {
        public void test() {
            System.out.println("from test");
        }
    }
}



/*

from test
done!


*/