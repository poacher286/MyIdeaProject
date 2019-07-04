package com.laraclasses.toppics.dev_Generics;

interface A < X >
{
	X test1();
	void test2(X x1);
	void test3(X x1, X x2);
}
class B implements A <String>
{
	public String test1()
	{
		System.out.println("test1");
		return null;
	}
	public void test2(String s1)
	{
		System.out.println(s1);
		//return null;	
	}
	public void test3(String s1 , String s2)
	{
		System.out.println(s1 + s1);
		//return null;
	}
}
class C implements A <Integer>
{
	public Integer test1()
	{
		System.out.println("test1");
		return null;
	}
	public void test2(Integer s1)
	{
		System.out.println(s1);
		//return null;	
	}
	public void test3(Integer s1 , Integer s2)
	{
		System.out.println(s1 + s1);
		//return null;
	}
}
class M16
{
	public static void main(String[] args)
	{
		B b1 = new B();
		String s1 = b1.test1();
		b1.test2("String1");
		b1.test3("String2" , "String2");

		C c1 = new C();
		Integer s2 = c1.test1();
		c1.test2(10);
		c1.test3(20 , 30);
		System.out.println("done");
	}
}