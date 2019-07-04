package com.laraclasses.toppics.dev_Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@interface A
{
	String message();
}

@Retention(RetentionPolicy.RUNTIME)
@interface B
{
	String message();
}

@A(message = " JAVA ")
@B(message = " JAYA ")
class M14
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("M14");
		Annotation[] annotations = c1.getAnnotations();
		for (Annotation annotation : annotations ) 
		{
			System.out.println(annotation);
		}
		System.out.println("Hello");
	}
}

/*
@B is only loading to the memory at the RUNTIME
through Class.forName() we can find class object
*/