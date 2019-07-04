package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M82
{
	public static void main(String[] args) 
	{
		String src = "abc@hello";
		String exp = "^[a-z]+@[a-z]+$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}

//true
/*
String exp = "^[a-z]+@[a-z]+$";
from starting min one lowercase alphabet
after @ min one alphabet till to the end 
*/