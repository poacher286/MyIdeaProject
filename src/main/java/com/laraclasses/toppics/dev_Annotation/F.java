package com.laraclasses.toppics.dev_Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface F
{
	String message() ;
}

/*
Retention is another meta annotation
through meta annotation we are providing description to E annotation

SOURCE
CLASS
RUNTIME

*/

/*

*/