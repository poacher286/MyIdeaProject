package com.laraclasses.toppics.dev_Generics;

class A
{
	int i;
	double j;
}
class M2
{

	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		a1.j = 2.5;
		A a2 = new A();
		a2.i = 20;
		a2.j = 5.5;
		System.out.println("Hello World!");
	}
}

/*
for every object of A data type of i will be int only.
data type is not varying from one object to another object.
*/