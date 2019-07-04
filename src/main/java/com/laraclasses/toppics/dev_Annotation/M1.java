package com.laraclasses.toppics.dev_Annotation;

@interface A
{
	String someDesc();	
}

@A(someDesc = "some desc about A")
class M1
{
	@A(someDesc = "some desc about A main")
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}
