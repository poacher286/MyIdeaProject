package com.laraclasses.toppics.dev_Generics;

class A < X >
{
	X obj;
}
class M25
{
	public static void main(String[] args)
	{
		A<? extends Number> a1 = null;
		a1 = new A<Number>();
		a1 = new A<Integer>();
		a1 = new A<Byte>();
		a1 = new A<Short>();
		a1 = new A<Float>();

		System.out.println("Done");
	}
}

/*
2nd way of using Wildcard
now refence type is wild card extends Number
so it is bound to use Number and subclass to Number
now a1 should point to Number and subclass to Number
not other than Number type

*/