package com.GeneralJavapgm. JavaPgms;

public class PrintDublicate {

	public static void main(String[] args) {
		String S="Swiggy";
	
		char[] R = S.toCharArray();
		
		for (int i = 0; i < R.length; i++) 
		{
			for (int j = i+1; j < R.length; j++) 
			{
				if(R[i]==R[j])
				{
					System.out.println(R[i]);

				}
			}
		}		


	}

}
