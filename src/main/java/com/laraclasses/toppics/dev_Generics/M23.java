package com.laraclasses.toppics.dev_Generics;

class A < X >
{
	X obj;
}
class M23
{
	public static void main(String[] args)
	{
		A<?> a1 = null;
		a1 = new A<Integer>();
		a1 = new A<Object>();
		a1 = new A<P>();
		a1 = new A<String>();
		a1 = new A<Thread>();

		System.out.println("Done");
	}
}

/*
----Wildcard----
A<?> a1 = null;
now we can assign any data type to a1
a1 is a refernce of wildcard <?>

It is not limited to specific hirarchy
any object can be refenced by wildcard <?>


*/