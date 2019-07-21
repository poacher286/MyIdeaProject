package com.laraclasses.toppics.dev_Generics;

class A15 < Test >
{
	A15(Test obj)
	{
		System.out.println(obj);
	}
}
class M15
{
	public static void main(String[] args)
	{
		A15<String> a1 = new A15<String>("String1");
		A15<Integer> a2 = new A15<Integer>(10);
		A15<Double> a3 = new A15<Double>(1.45);
		System.out.println("Done");
	}
}
/*
in order to create Object to class A15
we have to supply generics

constructor argument vary
not only inside a class
even inside constructor also we can use generics
inside interface also we can use generics

*/