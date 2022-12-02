package com.GeneralJavapgm.JavaPgms;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int[] S= {80,25,62,91,5,99};
		for (int i = 0; i < S.length-1; i++) 
		{

			if (S[i]<S[i+1])
			{
				int temp=S[i];
				S[i]=S[i+1]; 
				S[i+1]=temp;
			}
		}
		for (int k = 0; k < S.length; k++) 
		{
			System.out.println(S[k]);
			
		}
	
	}

}
