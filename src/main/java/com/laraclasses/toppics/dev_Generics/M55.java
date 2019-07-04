package com.laraclasses.toppics.dev_Generics;

class A < T >
{
	T var;
}
class M55
{
	public static void main(String[] args) 
	{
		A<int> a1 = new A<int>();
		System.out.println("Done");
	}
}

/*
if refence type is wildcard super something 
generic data type can not be replaced for premitives
CTE

generic datatype can not be put with static members
generics are mainly for changing one data type to another
Static memebers are not the members of Objects
if member not calling by itself how we can call that is why we can not apply 
generic to static
ref --> M19 
*/