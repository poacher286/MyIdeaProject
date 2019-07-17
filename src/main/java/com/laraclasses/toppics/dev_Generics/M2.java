package com.laraclasses.toppics.dev_Generics;

class A2 {
    int i;
    double j;
}

public class M2 {

    public static void main(String[] args) {
        A2 a1 = new A2();
        a1.i = 10;
        a1.j = 2.5;
        A2 a2 = new A2();
        a2.i = 20;
        a2.j = 5.5;
        System.out.println("Hello World!");
    }
}

/*
for every object of A2 data type of i will be int only.
data type is not varying from one object to another object.
*/