package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	T obj;
}
class M52
{
	static void test(A<? super Number> arg)
	{

	}
	public static void main(String[] args) 
	{
		test(new A<Number>());		
		test(new A<Object>());		
		test(new A<Integer>());		
		test(new A<String>());		
	}
}

/*

only Number and superclass to Number 
ref --> M19 
*/