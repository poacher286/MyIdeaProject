package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M78
{
	public static void main(String[] args) 
	{
		String src = "abcd1234578cdef9";
		String exp = "^[a-z]*";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}

//true
/*
group of word consider as one occurrence
one character or more than one
but print only words
(*) represents 0 or more
(+) represents one or more

*/
/*

starting with alphabets 
it can be zer0 alphabets or one

*/