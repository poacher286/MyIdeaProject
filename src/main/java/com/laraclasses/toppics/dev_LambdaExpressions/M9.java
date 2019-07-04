package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	void test(int i, String s1); //test method is taking some srgument
}

class M9
{
	
	public static void main(String[] args) 
	{
		 A a1 = (x, y) ->{
						System.out.println("from test :" + x);  
						System.out.println("from test :" + y);  
						};
		a1.test(10, "abc"); //supply value to test method
		System.out.println("done!");
	}
}



/*

from test: 10
from test: abc
done!

single interfce methods--lambda expression

*/