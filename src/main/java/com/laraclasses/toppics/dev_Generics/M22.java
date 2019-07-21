package com.laraclasses.toppics.dev_Generics;

class A22 < X extends Number>
{
	X obj;
}
class M22
{
	public static void main(String[] args)
	{
//		A22<P> a1 = new A22<P>();
//		A22<Q> a2 = new A22<Q>();
		System.out.println("Done");
	}
}

/*
P and Q are not subclass to Number
we should not supply obj data type to P or Q
<X extends Number> // only Number class and subclass to Number
*/