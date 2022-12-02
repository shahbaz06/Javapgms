package com.GeneralJavapgm.JavaPgms;

public class Merge2ArrayIntergers {

	public static void main(String[] args) {
		int[] a= {2,5,6};
		int[] b= {4,3,7};
		int[] c=new int[a.length+b.length];
		int ci=0;
		for (int i = 0; i < a.length; i++) 
		{
			c[ci]=a[i];
			ci++;
		}
		for (int i = 0; i < b.length; i++)
		{
			c[ci]=b[i];
			ci++;
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.println(c[i]);
			
		}
		for (int j = 0; j < c.length-1; j++)
		{
			if(c[j]<c[j+1])
			{
				
			}
			System.out.println(c[j]);
		}
		
//		System.out.println(Arrays.toString(c));
		

	}

}
