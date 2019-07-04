package com.laraclasses.toppics.dev_Generics;

class A
{
	void test(String args)
	{

	}
}
class M5
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
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