package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M76
{
	public static void main(String[] args) 
	{
		String src = "a1234578c9";
		String exp = "[a-z]";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}


/*
Occurrence of lower case a-z alphabets
any alphabet from a-z
*/
