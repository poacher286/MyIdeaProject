package com.laraclasses.toppics.dev_RegularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M66
{
	public static void main(String[] args) 
	{
		String src = "a1b@$$-!@# $%^ & *( ) _+ 2c 3 % 4_ 5 R8 Y05646&*&*(";
		String exp = "\\s";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + " : " + m1.group());
		}
	}
}

/*/*

"\\s" -- > white space index
"[ ]" -->space

"\\S" -- > other than white space index
*/