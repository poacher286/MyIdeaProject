package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	T obj;
}
class M43
{
	static void test(A<?> arg)
	{
		arg.obj = "abc";
	}
	public static void main(String[] args)
	{
		test(new A<String>());
		System.out.println("Done");
	}
}

/*
line 9 :
 we can not assign obj to String
 A type wild card 

*/