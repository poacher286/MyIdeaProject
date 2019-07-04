package com.laraclasses.toppics.dev_Generics;

class A < X extends R>
{
	X obj;
}
class M17
{
	public static void main(String[] args)
	{
		A<R> a1 = new A<R>();
		A<S> a2 = new A<S>();
		A<T> a3 = new A<T>();
		
		System.out.println("Done");
	}
}

/*
object type is always R type or subclass to R
not P , Q type
*/