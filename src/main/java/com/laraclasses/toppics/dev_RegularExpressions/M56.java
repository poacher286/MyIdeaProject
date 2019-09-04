package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M56
{
	public final static String TEST = "wqedw";
	public static void main(String[] args) 
	{
		System.out.println(TEST);
		String src = "Hello to All";
		String exp = "l";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}
/*

2:l
3:l
10:l
11:l

every occurrence of "l" inside source
find() keep on returning true as long as expression are there

they provide inbuilt methods 
Pattern.compile(src)

*/