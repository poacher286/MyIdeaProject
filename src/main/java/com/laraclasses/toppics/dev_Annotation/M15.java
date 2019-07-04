package com.laraclasses.toppics.dev_Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
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
class C
{
	/*
		C class describing @A and @B
		from C only @A Inherited to M15
	*/
}

class M15 extends C
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("M15");
		Annotation[] annotations = c1.getAnnotations();
		for (Annotation annotation : annotations ) 
		{
			System.out.println(annotation);
		}
		System.out.println("Hello");
	}
}

/*
@A(message = JAVA)
*/

/*
while describing @A annotation 
we are using 2 annotation
@Retention
@Inherited
both the annotationhaving same RetentionPolicy RUNTIME
C class having same RetentionPolicy RUNTIME

*/

/*

*/