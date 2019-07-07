package com.laraclasses.toppics.dev_LambdaExpressions;

//A1 is functional interface
interface A1 {
    void test();
}

class B1 implements A1 {
    public void test() {
        System.out.println("from test");
    }
}

public class M1 {
    public static void main(String[] args) {
        B1 b1 = new B1();
        b1.test();
        System.out.println("done!");
    }
}



/*

from test
done!


*/


/*

lambda expression are introduced in JDK 1.8
empty interface is called marker interface
any interface with only one method is called functional interface
marker interface are cloneable and serializable

functional interface are----lambda expression are only for functional interfaces
Runnable only one method ---i.e run method
comparable interface---only one method compareTo
comparator-----only one method compare

*/