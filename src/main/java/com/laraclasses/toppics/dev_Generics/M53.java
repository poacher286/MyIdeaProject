package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	T obj;
}
class M53
{
	public static void main(String[] args) 
	{
		A<? super Number> a1 = null;
		a1 = new A<Number>();
		a1.obj = 100;
		System.out.println("Done");
	}
}

/*
while checking compiler allowing us to compile successfully

only Number and superclass to Number 
ref --> M19 
*/