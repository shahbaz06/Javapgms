package com.GeneralJavapgm.JavaPgms;

import java.util.TreeSet;

public class ArrayStringReverse {

	public static void main(String[] args) {
		String A="shahbaz";
		char[] B = A.toCharArray();
//		Arrays.sort(B);
		System.out.println(B);
		for (int i = B.length-1; i >=0 ; i--) 
		{
			System.out.println(B[i]);
		}
		int[] V= {5,8,6,9,0,8,9,7,5,7,78,85,99,1,10,1111,45,454,2};
//		Arrays.sort(V);
		
		TreeSet<Integer>  H=new TreeSet<Integer>();
		for (int i = 0; i <V.length; i++)
		{
			H.add(V[i]);
		}
//		System.out.println(H);
		for (Integer F : H) 
		{
			System.out.println(F);
		}
		
		
		

	}

}
