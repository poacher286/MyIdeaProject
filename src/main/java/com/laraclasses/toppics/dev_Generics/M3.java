package com.laraclasses.toppics.dev_Generics;

class A3
{
	String obj;
}
public class M3
{

	public static void main(String[] args) 
	{
		A3 a1 = new A3();
		a1.obj = "Hello";

		A3 a2 = new A3();
		a2.obj = "World";
		System.out.println("Hello World!");
	}
}
/*
for every object of A3 obj data type is String only
obj data type remain same for every object of A3

*/