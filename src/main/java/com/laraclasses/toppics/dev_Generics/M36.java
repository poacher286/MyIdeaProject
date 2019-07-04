package com.laraclasses.toppics.dev_Generics;

class A < X >
{
	void test(X arg)
	{
	}
}
class M36
{
	public static void main(String[] args)
	{
		A< ? > a1 = null;
		a1 = new A<P>();
		a1.test(new P());
		System.out.println("Done");
	}
}

/*
test method arg type is any type

*/