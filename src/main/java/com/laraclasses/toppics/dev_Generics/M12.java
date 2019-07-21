package com.laraclasses.toppics.dev_Generics;

class A12 < X >  //identifier can chose inside angle bracket
{
	void test(X obj)
	{
	} 
}
class M12
{
	public static void main(String[] args)
	{
		A12<Integer> a1 = new A12<Integer>();
		A12<String> a2 = new A12<String>();
		A12<Double> a3 = new A12<Double>();
		a1.test(10);
		a2.test("hello");
		a3.test(1.5);
		System.out.println("Hello world");
	}
}
