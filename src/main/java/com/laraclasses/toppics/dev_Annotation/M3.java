package com.laraclasses.toppics.dev_Annotation;

@interface A3
{
	int version();
	String author();	
}

@A(version = 100 , author = "Poacher")
class M3
{
	@A(version = 100 , author = "Poacher")
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}

/*
if we want to provide any description with int value then 
we must provide int return type to it 

defining annotation with any number of method declaration
for every method declaration we have to provide value with same return type

*/
