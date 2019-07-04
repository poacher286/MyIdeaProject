package com.laraclasses.toppics.dev_Annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
@Target(ElementType.METHOD)
@interface D
{
	String message() ;
}

/*
Target is already define 
we can treat as a meta annotation
it is used to describe another annotation
Target is an annotation which is used to describe D annotation
D is used to decribe only METHOD
*/