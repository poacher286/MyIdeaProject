package com.laraclasses.toppics.dev_Generics;

class A < Test >
{
	A(Test obj)
	{
		System.out.println(obj);
	}
}
class M15
{
	public static void main(String[] args)
	{
		A<String> a1 = new A<String>("String1");
		A<Integer> a2 = new A<Integer>(10);
		A<Double> a3 = new A<Double>(1.45);
		System.out.println("Done");
	}
}
/*
in order to create Object to class A
we have to supply generics

constructor argument vary
not only inside a class
even inside constructor also we can use generics
inside interface also we can use generics

*/