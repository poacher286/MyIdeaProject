package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	void test();
}

class M2
{
	static class B implements A //ststic inner class we can use in the main method
	{
		public void test()
		{
		System.out.println("from test");
		}
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done!");
	}
}



/*

from test
done!


*/