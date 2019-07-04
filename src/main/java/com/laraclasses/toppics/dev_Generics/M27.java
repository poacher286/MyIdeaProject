package com.laraclasses.toppics.dev_Generics;

class A < X >
{
	X obj;
}
class M27
{
	public static void main(String[] args)
	{
		A<? extends Q> a1 = null;
		a1 = new A<Q>();
		a1 = new A<R>();
		a1 = new A<S>();
		a1 = new A<T>();
		System.out.println("Done");
	}
}

/*
wildcard 
A<? extends Q> a1 = null;
now a1 pointing to Q and any subclass to Q

*/