package com.laraclasses.toppics.dev_Annotation;

@F(message = " JAVA ")
class M13
{
	@D(message = " java")
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}


/*
whenever M13 is loading to memory 
F annotation also loading to memory beccause of RUNTIME RetentionPolicy

*/
