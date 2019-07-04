package com.laraclasses.toppics.dev_Generics;

class A < X extends Number>
{
	X obj;
}
class M22
{
	public static void main(String[] args)
	{
		A<P> a1 = new A<P>();
		A<Q> a2 = new A<Q>();
		System.out.println("Done");
	}
}

/*
P and Q are not subclass to Number
we should not supply obj data type to P or Q
<X entends Number> // only Number class and subclass to Number
*/