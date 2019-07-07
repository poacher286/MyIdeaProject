package com.laraclasses.toppics.dev_LambdaExpressions;

interface A6 //A6 is functional interface
{
	void test();
}

class M6
{
	
	public static void main(String[] args) 
	{
		 A6 a1 = () -> //lambda expression
						{
						System.out.println("from test"); 
						System.out.println("from test"); 
						System.out.println("from test"); 
						System.out.println("from test"); 
						};
		a1.test();
		System.out.println("done!");
	}
}



/*

from test
done!

single interfce methods--lambda expression

*/