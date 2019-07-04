package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	void test();
}

class M4
{
	
	public static void main(String[] args) 
	{
		 A a1 = new A() //anonymous inner class we can use in the main method
		{
			public void test()
			{
			System.out.println("from test");
			}
		};
		a1.test();
		System.out.println("done!");
	}
}



/*

from test
done!


*/