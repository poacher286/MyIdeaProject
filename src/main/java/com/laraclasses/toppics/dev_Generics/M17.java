package com.laraclasses.toppics.dev_Generics;

class A17 < X extends R>
{
	X obj;
}
class M17
{
	public static void main(String[] args)
	{
		A17<R> a1 = new A17<R>();
		A17<S> a2 = new A17<S>();
		A17<T> a3 = new A17<T>();
		
		System.out.println("Done");
	}
}

/*
object type is always R type or subclass to R
not P , Q type
*/