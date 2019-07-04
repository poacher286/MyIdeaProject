package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M77
{
	public static void main(String[] args) 
	{
		String src = "abcd1234578cdef9";
		String exp = "[a-z]+";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}


/*
group of word consider as one occurrence
one character or more than one

*/
