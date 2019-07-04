package com.laraclasses.toppics.dev_Annotation;

@interface A
{
	int version() default 1;
	String author() default "abcd";	
}

@A
class M7
{
	@A
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}

/*
Annotation should be Syntacticllay correct
Otherwise CTE

every method should be there to compile successfully

any number of method declaration should be in the annotation
for any annotation method we can provide a default value

*/