package com.laraclasses.toppics.dev_RegularExpressions;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


class M55
{
	public static void main(String[] args) 
	{
		String src = "Hello to All";
		String exp = "o";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}

/*
4 : o
7 : o

m1.start() --> index 
m1.group() --> content

regex regular expression
by using Pattern and Matcher we can find out multiple location of expression inside source

*/