package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M73
{
	public static void main(String[] args) 
	{
		String src = "a12345678c9";
		String exp = "\\d+";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}


/*
1 : 12345678
10 : 9

\\d+ --> + stands for one or more
one digits or more digits group together


*/
