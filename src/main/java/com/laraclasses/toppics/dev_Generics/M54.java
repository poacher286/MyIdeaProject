package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	void test(T obj)
	{

	}
}
class M54
{
	public static void main(String[] args) 
	{
		A<? super Number> a1 = null;
		a1 = new A<Number>();
		a1.test(45.5);
		System.out.println("Done");
	}
}

/*
if refence type is wildcard super something 
generic data type can not be replaced for premitives


ref --> M19 
*/