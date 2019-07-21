package com.laraclasses.toppics.dev_Generics;

class A19 < X extends R>
{
	X obj;
}
class M19
{
	public static void main(String[] args)
	{
//		A19<Integer> a1 = new A19<Integer>();
//		A19<String> a2 = new A19<String>();
		System.out.println("Done");
	}
}

/*
only R type is allowed and subclass to R
not other type are allowed


		+-------+
		| Object|
		+-------+
			^
			|
		+-------+
		| Number|
		+-------+
			^
			|
		1.Byte
		2.Short 
		3.Integer 
		4.Long
		5.Float 
		6.Double
*/