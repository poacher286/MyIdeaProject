package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	T obj;
}
class M51
{
	public static void main(String[] args) 
	{
		A<? super Number> a1 = null;
		a1 = new A<Number>();
		a1 = new A<Integer>();
		a1 = new A<Object>();
		a1 = new A<String>();
	}
}

/*

only Number and superclass to Number 
ref --> M19 
*/