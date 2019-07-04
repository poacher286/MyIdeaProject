package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	T obj;
}
class M48
{
	static void test(A<? extends Number> arg)
	{
		
	}
	public static void main(String[] args)
	{
		A <? extends Number> a1 =  new A<Integer>();
		a1.obj = 9000;
		System.out.println("Done");
	}
}

/*
for a Number class there can be any number of subclasses'
we can not identified how many subclass of Integer Byte or any Subclass to number
how can we assign Interger straight away

*/