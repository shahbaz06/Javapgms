package com.GeneralJavapgm.JavaPgms;

public class ReverseString {

	public static void main(String[] args) 
	{
		String S="shahbaz";
		String[] R=S.split("");
		for (int i = R.length-1; i >=0 ; i--) 
		{
			System.out.print(R[i]);
		}

//		String rev="";
//		for (int i = S.length()-1; i >=0 ; i--) 
//		{
//			rev=rev+S.charAt(i);
//			
//		}
//		System.out.println(rev);
	}

}
