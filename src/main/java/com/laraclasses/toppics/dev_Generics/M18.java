package com.laraclasses.toppics.dev_Generics;

class A18 < X extends R>
{
	X obj;
}
class M18
{
	public static void main(String[] args)
	{
		A18<R> a1 = new A18<R>();
//		A18<P> a2 = new A18<P>();
//		A18<Q> a3 = new A18<Q>();
		
		System.out.println("Done");
	}
}

/*
CTE
X obj can not be P or Q type
always be R type or subclass to R
*/