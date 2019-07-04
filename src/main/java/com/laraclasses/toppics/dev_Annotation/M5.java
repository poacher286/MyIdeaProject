package com.laraclasses.toppics.dev_Annotation;

@interface A
{
	int version();
	String author();	
}

@A(author = "Poacher")
class M5
{
	@A(author = "Poacher")
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}

/*
Annotation should be Syntacticllay correct
Otherwise CTE

every method should be there to compile successfully
*/