package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	int test(); //retuen type
}

class M11
{
	
	public static void main(String[] args) 
	{
		 A a1 = () -> {
						System.out.println("from test");
						return 200;
						};
		int i = a1.test(); //supply value to test method
		System.out.println("done with : " + i);
	}
}



/*

from test:
done with: 200
done!

single interfce methods--lambda expression

*/