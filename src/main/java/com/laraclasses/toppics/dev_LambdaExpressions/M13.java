package com.laraclasses.toppics.dev_LambdaExpressions;

@FunctionalInterface //Annotation name @FunctionalInterface--optional--if only one interface
interface A //A is functional interface
{
	int sum(int i, int j); //retuen type
}

class M13
{
	
	public static void main(String[] args) 
	{
		 A a1 = (i , j) -> i+ j;
		int i = a1.sum(10 , 25); //supply value to test method
		System.out.println("done with : " + i);
	}
}



/*


done with: 35


single interfce methods--lambda expression
@annotation are used to describe syntactical description

*/