package com.laraclasses.toppics.dev_Annotation;

@E(message = " JAVA ")
class M12
{
	@D(message = " java")
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}

/*
because of retention policy class whereever we decribing E 
decription will be moving to the .class file also 
compiler will be transfering it to .class file
it is not moving to the memory
only in .class file
*/