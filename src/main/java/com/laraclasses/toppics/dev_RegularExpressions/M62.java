package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M62
{
	public static void main(String[] args) 
	{
		String src = "a1b2c3%4_5R8Y05646&*&*(";
		String exp = "\\d";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}

/*

"\\d" --> index of digits 0-9
any digits can be represented though \d
\ can not be supplied inside " "

*/