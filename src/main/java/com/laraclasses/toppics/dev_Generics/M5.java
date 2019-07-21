package com.laraclasses.toppics.dev_Generics;

class A5
{
	void test(String args)
	{

	}
}

public class M5
{
	public static void main(String[] args)
	{
		A5 a1 = new A5();
		A5 a2 = new A5();
		A5 a3 = new A5();
		a1.test("Hello");
		a2.test("world");
		a3.test("done");
		System.out.println("hello done");
	}
}
/*
for every object of A
test method argument is a string
object to object , method argument data type is not changing

*/