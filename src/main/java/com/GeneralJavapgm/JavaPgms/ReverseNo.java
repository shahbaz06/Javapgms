package com.GeneralJavapgm.JavaPgms;

public class ReverseNo {

	public static void main(String[] args)
	{
		int No = 1451;
		int rev = 0;
		int Pan=No;
		while (No!=0) 
		{
			int r=No%10;
			rev=(rev*10)+r;
			No=No/10;
		}
		
		System.out.println(rev);
		if(rev==Pan)
		{
			System.out.println("Its palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
		
		

	}

}
