package com.laraclasses.toppics.dev_Annotation;

@interface A1
{
	String someDesc();	
}

@A1(someDesc = "some desc about A1")
class M1
{
	@A(someDesc = "some desc about A1 main")
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}
