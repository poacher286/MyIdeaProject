package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern; //regular expression
import java.util.regex.Matcher;
class M85
{
	public static void main(String[] args) 
	{
		// String src = "abc.xyz.test@hello";
		String src = "abc.d.ef@hello.co.im";
		String exp = "^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))+[\\w-\\.]*\\.[a-z]{2,}$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}

//true
/*		
String exp = "^[a-zA-z_]+@[a-zA-Z0-9_]+([a-zA-Z0-9_]+\\.)*$";
first character is should be lower case
afterwards group can have [a-zA-Z0-9] with (.) min one
before @ [a-zA-z0-9] can allow
*/

/*
ending with (.) with 2 alphabet at the end
*/
// 
/*
(.) is allowed not immediately @
min one character after @
*/

/*
validate email address
validate number
*/