package com.laraclasses.toppics.dev_Generics;

class A11 < X >  //identifier can chose inside angle bracket
{
	X obj; 
}
class M11
{
	public static void main(String[] args)
	{
		A11<Integer> a1 = new A11<Integer>();
		A11<String> a2 = new A11<String>();
		A11<Double> a3 = new A11<Double>();
		A11 a4 = new A11(); //if we are not giving data type then it is object data type
		a1.obj = 10;
		a2.obj = "hello";
		a3.obj = 1.5;
		a4.obj = new Object();
		System.out.println("Hello world");
	}
}

/*
obj is attribute inside class A11
obj data type is not fixed data type
if we are not giving data type to A11
then it is Object data type
generics are introduced in jdk1.5

*/