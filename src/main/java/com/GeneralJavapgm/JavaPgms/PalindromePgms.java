 package com.GeneralJavapgm.JavaPgms;

public class PalindromePgms {

	public static void main(String[] args) 
	{
		String s="shahbaz";
		String rev="";
		for (int i = s.length()-1; i >=0 ; i--) 
		{
			rev=rev+s.charAt(i);
	
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("It is palendrome");
		}
		else
		{
			System.out.println("It is not a palendrome");
		}

	}

}
