package com.laraclasses.toppics.dev_Annotation;

@interface A
{
	int version();
	String author();	
}

@A(version = 100 , author = "Poacher")
class M4
{
	@A(version = 100)
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}

/*
Annotation should be Syntacticllay correct
Otherwise CTE
*/