package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M81
{
	public static void main(String[] args) 
	{
		String src = "1ab.cd12345.78c@def9";
		String exp = "[a-z]+@[a-z]+";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}

//true
/*
String exp = "[a-z]+@[a-z]+";
before @ min one after @ min one lower case alphabets should be there
*/