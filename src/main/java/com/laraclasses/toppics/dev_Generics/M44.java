package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	void test(T obj)
	{
		
	}
}
class M44
{
	public static void main(String[] args)
	{
		A<?> a1 = new A<String>();
		a1.test("abs");
		System.out.println("Done");
	}
}

/*
a1 can assign to any object of A
how can we supply to A object to String type
but calling a1.test() we can not supply

by using a1 we can not call test() because of test method taking generic type
CTE
*/