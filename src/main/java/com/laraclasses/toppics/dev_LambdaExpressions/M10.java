package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	int test(); //retuen type
}

class M10
{
	
	public static void main(String[] args) 
	{
		 A a1 = () -> 200; //compiler taking care of subcalss and returning value
		int i = a1.test(); //supply value to test method
		System.out.println("done with : " + i);
	}
}



/*

from test: 10
from test: abc
done!

single interface methods--lambda expression

*/