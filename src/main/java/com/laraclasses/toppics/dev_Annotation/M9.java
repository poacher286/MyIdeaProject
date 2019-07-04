package com.laraclasses.toppics.dev_Annotation;

@interface A
{
	int[] version() ;
}

@A(version = {1, 2 ,3})
class M9
{
	@A(version = {1, 2 ,3})
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}

/*
we can provide Array of primitives data type
if any runtime values req then aso we can supply annotation
we can supply some configuration description to annotation
we can provide desc to compiler as well as runtime environment
*/