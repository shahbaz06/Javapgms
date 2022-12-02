package com.GeneralJavapgm.JavaPgms;

import java.util.Arrays;
import java.util.Collections;

public class Merge2ArrayInAscending {

	public static void main(String[] args) {
		int[] A= {10,40,80,45};
		int[] B= {30,70,90,55};
		int Ci=0;
		int[] C=new int[A.length+B.length];
		for (int i = 0; i < A.length; i++) 
		{
			C[Ci]=A[i];
			Ci++;
		}
		for (int i = 0; i < B.length; i++)
		{
			C[Ci]=B[i];
			Ci++;
		}
		for (int i = 0; i < C.length; i++)
		{
			Arrays.sort(C);
			System.out.println(C[i]);
//			for (int k = 0; k < C.length; k++) {
//				System.out.println(C[k]);
//			}
		}
//			System.out.println(C[i]);
//			for (int j = 0; j < C.length-1; j++) 
//			{
//				if(C[j]>C[j+1])
//				{
//					int temp=C[j];
//					C[j]=C[j+1];
//					C[j+1]=temp;
//				}
//		
//			}
//
//		}
//		for (int i = 0; i < C.length; i++)
//		{
//			System.out.println(C[i]);
//			
//		}
	}

}
