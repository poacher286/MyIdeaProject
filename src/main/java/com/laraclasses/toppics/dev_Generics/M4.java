package com.laraclasses.toppics.dev_Generics;

class A4
{
	String obj1;
	Integer obj2;
	Double obj3;
}
class M4
{

	public static void main(String[] args)
	{
		A4 a1 = new A4();
		a1.obj1 = "Hello";
		a1.obj2 = 10;
		a1.obj3 = 1.5;
		A4 a2 = new A4();
		a2.obj1 = "World";
		a2.obj2 = 20;
		a2.obj3 = 2.5;
		System.out.println("Hello World!");
	}
}
/*
object to object attributes data type is not changing
attributes data type is fixed for every object

*/
