package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	void test();
}

class M5
{
	
	public static void main(String[] args) 
	{
		 A a1 = () -> System.out.println("from test"); //only paranthessis A is interface with only one method
		a1.test();
		System.out.println("done!");
	}
}



/*

from test
done!

single interfce methods--lambda expression

*/