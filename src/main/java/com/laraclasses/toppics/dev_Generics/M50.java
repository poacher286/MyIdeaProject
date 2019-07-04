package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	void method(T obj)
	{

	}
}
class M50
{
	static void test(A<? extends Number> arg)
	{
		arg.method(new Byte(10));	
	}
}

/*

we can not call any method while arg is wildcard or wildcard extends something
CTE
*/