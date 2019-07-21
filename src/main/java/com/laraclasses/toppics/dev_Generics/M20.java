package com.laraclasses.toppics.dev_Generics;

class A20 < X extends Number>
{
	X obj;
}
class M20
{
	public static void main(String[] args)
	{
		A20<Number> a1 = new A20<Number>();
		A20<Byte> a2 = new A20<Byte>();
		A20<Short> a3 = new A20<Short>();
		A20<Integer> a4 = new A20<Integer>();
		A20<Long> a5 = new A20<Long>();
		A20<Float> a6 = new A20<Float>();
		A20<Double> a7 = new A20<Double>();
		
		System.out.println("Done");
	}
}

/*
object type is always R type or subclass to R
not P , Q type

Number is subclass to Object (Wrapper Class)
Inside Number these are Subclasses
*/