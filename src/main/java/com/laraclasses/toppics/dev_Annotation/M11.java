package com.laraclasses.toppics.dev_Annotation;

class M11
{
	@D(message = " java")
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}

/*
Target is already define 
we can treat as a meta annotation
it is used to describe another annotation
Target is an annotation which is used to describe D annotation
D is used to decribe only METHOD
*/

/*
@D annotation is only allowed for METHOD 
can not be used for classes
*/

/*
@D annotation is only for main method
*/