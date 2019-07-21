package com.laraclasses.toppics.dev_Generics;

class A13 < X >  //identifier can chose inside angle bracket
{
	X obj;
	X test()
	{
		return obj;
	} 
}
class M13
{
	public static void main(String[] args)
	{
		A13<Integer> a1 = new A13<Integer>();
		A13<String> a2 = new A13<String>();
		A13<Double> a3 = new A13<Double>();
		Integer obj1 = a1.test();
		String obj2 = a2.test();
		Double obj3 = a3.test();
		System.out.println("Hello world");
	}
}
