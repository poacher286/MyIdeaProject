package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	void test(int i); //test method is taking some srgument
}

class M7
{
	
	public static void main(String[] args) 
	{
		 A a1 = (int x) ->System.out.println("from test :" + x);  //x as indetifier
		a1.test(10); //supply value to test method
		System.out.println("done!");
	}
}



/*

from test
done!

single interfce methods--lambda expression

*/