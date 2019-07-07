package com.laraclasses.toppics.dev_LambdaExpressions;

interface A4 //A4 is functional interface
{
	void test();
}

public class M4
{
	
	public static void main(String[] args) 
	{
		//anonymous inner class we can use in the main method
		A4 a1 = new A4() {
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