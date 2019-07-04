package com.laraclasses.toppics.dev_Generics;

class A < X >
{
	X obj;
}
class M28
{
	public static void main(String[] args)
	{
		A<? extends Q> a1 = null;
		a1 = new A<Q>();
		a1 = new A<P>();// CTE
		a1 = new A<Object>();// CTE
		a1 = new A<String>();// CTE
		System.out.println("Done");
	}
}
/*
incompatible type P , Object , String
either Q type or subclass to Q
super class is not allowed
*/