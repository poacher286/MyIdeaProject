package com.laraclasses.toppics.dev_Generics;

class A < X extends R>
{
	X obj;
}
class M18
{
	public static void main(String[] args)
	{
		A<R> a1 = new A<R>();
		A<P> a2 = new A<P>();
		A<Q> a3 = new A<Q>();
		
		System.out.println("Done");
	}
}

/*
CTE
X obj can not be P or Q type
always be R type or subclass to R
*/