package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M63
{
	public static void main(String[] args) 
	{
		String src = "a1b2c3%4_5R8Y05646&*&*(";
		String exp = "\\D";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}

/*
"\\D" --> apart from digits other than digit any thing in the src
*/