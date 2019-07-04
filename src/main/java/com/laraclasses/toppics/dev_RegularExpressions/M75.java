package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M75
{
	public static void main(String[] args) 
	{
		String src = "a123  4  5 678   c 9";
		String exp = "\\s+";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}


/*
group of white space are consider as one
one or more white spaces are consider as one occurance
*/
