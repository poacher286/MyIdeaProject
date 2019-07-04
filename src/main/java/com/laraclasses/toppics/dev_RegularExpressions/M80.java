package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M80
{
	public static void main(String[] args) 
	{
		String src = "1ab.cd12345.78cdef9";
		String exp = "\\.";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " +m1.group());
		}
	}
}

//true
/*
(.) by default is escape character
soo we provide by \\ explicitly
*/