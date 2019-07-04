package com.laraclasses.toppics.dev_Annotation;

@interface A
{
	int someDesc();	
}

@A(someDesc = 100)
class M2
{
	@A(someDesc = 100)
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}

/*
if we want to provide any description with int value then 
we must provide int return type to it 

*/