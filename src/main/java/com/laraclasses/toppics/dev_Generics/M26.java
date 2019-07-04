package com.laraclasses.toppics.dev_Generics;

class A < X >
{
	X obj;
}
class M26
{
	public static void main(String[] args)
	{
		A<? extends Number> a1 = null;
		a1 = new A<Number>();
		a1 = new A<Integer>();
		a1 = new A<Object>();// CTE
		a1 = new A<String>();// CTE
		a1 = new A<Thread>();// CTE
		a1 = new A<P>();// CTE
		System.out.println("Done");
	}
}

/*
Even Object also not allowing 

*/