package com.laraclasses.toppics.dev_Generics;

class A
{
	String obj;
}
class M3
{

	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.obj = "Hello";

		A a2 = new A();
		a2.obj = "World";
		System.out.println("Hello World!");
	}
}
/*
for every object of A obj data type is String only
obj data type remain same for every object of A

*/