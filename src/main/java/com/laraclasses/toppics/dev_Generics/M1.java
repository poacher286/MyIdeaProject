package com.laraclasses.toppics.dev_Generics;

class A1 {
    int i;
}

public class M1 {

    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.i = 10;

        A1 a2 = new A1();
        a2.i = 20;
        System.out.println("Hello World!");
    }
}

/*
for every object of A data type of i will be int only.
data type is not varying from one object to another object.
*/