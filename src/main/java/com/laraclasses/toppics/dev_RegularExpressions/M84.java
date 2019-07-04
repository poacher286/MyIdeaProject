package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M84
{
	public static void main(String[] args) 
	{
		// String src = "abc.xyz.test@hello";
		String src = "a1.B.C1.d5@hello";//true
		String exp = "^[a-z]([a-zA-Z0-9_]+\\.)*[a-zA-Z0-9_]+@[a-z]+$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}

//true
/*
String exp = "^[a-z]([a-zA-G0-9_]+\\.)*[a-zA-G0-9_]+@[a-z]+$";
first character is should be lower case
afterwards group can have [a-zA-Z0-9] with (.) min one
before @ [a-zA-z0-9] can allow
*/