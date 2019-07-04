package com.laraclasses.toppics.dev_Annotation;

class A
{
	@Deprecated
	void test1()
	{

	}
	void test2()
	{

	}
}
class M17
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		a1.test2();
		System.out.println("Hello");
	}
}

/*
Note: M17.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
*/

/*
whenever we are using @Deprecated annotation then we get compile time warning
outdated methods are describe as @Deprecated 
*/

/*
@SuppressWarnings("deprecation")
*/