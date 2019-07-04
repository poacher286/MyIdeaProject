package com.laraclasses.toppics.dev_LambdaExpressions;

interface A //A is functional interface
{
	void test();
}
class B implements A
{
	public void test()
	{
		System.out.println("from test");
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done!");
	}
}



/*

from test
done!


*/


/*

lambda expression are introduced in JDK 1.8
empty interface is called marker interface
any interface with only one method is called functional interface
marker interface are clonable and serilizable

functional interface are----lambda expression are only for functional interfaces
Runnbale only one method ---i.e run method
comparbale interface---only one method compareTo
compartor-----only one method compare

*/