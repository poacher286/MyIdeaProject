package com.laraclasses.toppics.dev_LambdaExpressions;

interface A5 //A5 is functional interface
{
	void test();
}

public class M5
{
	public static void main(String[] args)
	{
		 A5 a1 = () -> System.out.println("from test"); //only paranthessis A5 is interface with only one method
		a1.test();
		System.out.println("done!");
	}
}



/*

from test
done!

single interfce methods--lambda expression

*/