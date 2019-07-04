package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M70
{
	public static void main(String[] args) 
	{
		String src = "a1b@$$-!@# $%^ & *( ) _+ 2c 3 % 4_ 5 R8 Y05646&*&*(o";
		String exp = "o$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}

/*
true

$ Represents ending character

*/
