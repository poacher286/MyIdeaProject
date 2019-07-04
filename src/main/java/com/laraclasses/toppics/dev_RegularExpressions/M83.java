package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M83
{
	public static void main(String[] args) 
	{
		// String src = "abc.xyz.test@hello";
		String src = "abc@hello";//true
		String exp = "^[a-z]([a-z]+\\.)*[a-z]+@[a-z]+$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}

//true
/*
String exp = "^[a-z]([a-z]+\\.)*[a-z]+@[a-z]+$";
from starting min one alphabet
before @ minone alphabet
([a-z]+\\.) is always true
alphabet with (.) is optional
after @ min one alphabet till to the end 
*/

/*
() represents true
so ([a-z]+\\.)* content can be occur any time because of ()*
*/

/*
before @ no (.) can occur 
*/