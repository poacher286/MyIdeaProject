package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	T obj;
}
class M46
{
	public static void main(String[] args)
	{
		A<? extends Number> a1 = null;
		a1 = new A<Number>();
		a1 = new A<Object>();
		a1 = new A<Integer>();
		System.out.println("Done");
	}
}

/*
incompatible type 
A<Object> cannnot be converted to Number
Object is not a subclass to Number

*/