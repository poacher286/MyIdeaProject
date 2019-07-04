package com.laraclasses.toppics.dev_Generics;

class A < X >
{
	X obj;
}
class M29
{
	public static void main(String[] args)
	{
		A<? super Q> a1 = null;
		a1 = new A<Q>();
		a1 = new A<P>();
		a1 = new A<Object>();
		System.out.println("Done");
	}
}
/*
3rd way of using wildcard to the reference variable
wildcard
A<? super Q> a1 = null;
either Q or any super class to Q are allowed

not subclass to Q
*/