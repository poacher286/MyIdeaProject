package com.laraclasses.toppics.dev_Generics;

class A < X >  //identifier can chose inside angle bracket
{
	X obj; 
}
class M11
{
	public static void main(String[] args)
	{
		A<Integer> a1 = new A<Integer>();
		A<String> a2 = new A<String>();
		A<Double> a3 = new A<Double>();
		A a4 = new A(); //if we are not giving data type then it is object data type
		a1.obj = 10;
		a2.obj = "hello";
		a3.obj = 1.5;
		a4.obj = new Object();
		System.out.println("Hello world");
	}
}

/*
obj is attribute inside class A
obj data type is not fixed data type
if we are not giving data type to A 
then it is Object data type
generics are introduced in jdk1.5

*/