package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	void test();
}

class M3
{
	
	public static void main(String[] args) 
	{
		class B implements A //local inner class we can use in the main method
		{
			public void test()
			{
			System.out.println("from test");
			}
		}
		B b1 = new B();
		b1.test();
		System.out.println("done!");
	}
}



/*

from test
done!


*/