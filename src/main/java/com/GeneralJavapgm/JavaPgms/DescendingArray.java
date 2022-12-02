package com.GeneralJavapgm.JavaPgms;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {
		int[] A= {40,23,45,80,9,90,73};
//		for (int i = 0; i < A.length-1; i++)
//		{
//			for (int j = 0; j < A.length-1; j++) 
//			{
//				if (A[j]<A[j+1])
//				{
//					int temp=A[j];
//					A[j]=A[j+1];
//					A[j+1]=temp;
//					
//				}
//
//			}
//		
//		}
		Arrays.sort(A);
//		for (int i = 0; i < A.length; i++) {
//			System.out.println(A[i]);
//		}
		for (int i = A.length-1; i >=0 ; i--) {
			System.out.println(A[i]);
		}

	}

}
