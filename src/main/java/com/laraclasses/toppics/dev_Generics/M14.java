package com.laraclasses.toppics.dev_Generics;

class A <T , U>
{
	T obj1;
	U obj2;
	void test1(T t1)
	{

	}
	U test2()
	{
		return null;
	}
}
class M14
{
	public static void main(String[] args)
	{
		A<Integer , String> a1 = new A<Integer , String>();
		A<String , String> a2 = new A<String , String>();
		A<Integer , Integer> a3 = new A<Integer , Integer>();
		A<String , Integer> a4 = new A<String , Integer>();
	
		a1.obj1 = 10;
		a1.obj2 = "String1";
		
		a2.obj1 = "String2";
		a2.obj2 = "String3";

		a3.obj1 = 20;
		a3.obj2 = 30;

		a4.obj1 = "String4";
		a4.obj2 = 40;

		//<Integer , String>
		a1.test1(50);
		String s1 = a1.test2();

		//<Srting , String>
		a2.test1("String5");
		String s2 = a2.test2();
		
		//<Integer , Integer>
		a3.test1(60);
		Integer s3 = a3.test2();

		//<String , Integer>
		a4.test1("String6");
		Integer s4 = a4.test2();

		System.out.println("hello");
	}
}

/*
we can use generics any where in the entire class
where ever data type is required we can use generics


*/
