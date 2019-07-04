package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M61
{
	public static void main(String[] args) 
	{
		String src = "Java1 made2 easy3 for4 all5 Java developer";
		String exp = "[1-4]";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}

/*
"[a-p]" dynamic searching every character  from a-p inside []
every occurrence of an expression inside source serially
*/