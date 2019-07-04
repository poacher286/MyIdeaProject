package com.laraclasses.toppics.dev_Generics;

class A < X extends Number>
{
	X obj;
}
class M20
{
	public static void main(String[] args)
	{
		A<Number> a1 = new A<Number>();
		A<Byte> a2 = new A<Byte>();
		A<Short> a3 = new A<Short>();
		A<Integer> a4 = new A<Integer>();
		A<Long> a5 = new A<Long>();
		A<Float> a6 = new A<Float>();
		A<Double> a7 = new A<Double>();
		
		System.out.println("Done");
	}
}

/*
object type is always R type or subclass to R
not P , Q type

Number is subclass to Object (Wraper Class)
Inside Number these are Subclasses
*/