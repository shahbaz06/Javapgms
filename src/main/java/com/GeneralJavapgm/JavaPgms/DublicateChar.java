package com.GeneralJavapgm.JavaPgms;

import java.util.Arrays;
import java.util.TreeSet;

public class DublicateChar {

	public static void main(String[] args) {
		String S="Davanthiidevi";
		char[] f = S.toCharArray();
//		TreeSet<Character>  H=new TreeSet<Character>();
//		for (int i = 0; i <f.length; i++)
//		{
//			H.add(f[i]);
//		}
//		System.out.println(H);
//		for (Character F : H) 
//		{
//			
//			System.out.println(F);
//		}
//		char[] f = S.toCharArray();
		
		for (int i = 0; i < f.length; i++)
		{
			
			for (int j = i+1; j < f.length; j++) {
				if(f[i]==f[j]) 
				{
					System.out.println(f[i]);
					
				}	
				if(f[i]!=f[j]) {
					System.out.println(f[j]);
				}
			}
			
			
		}
		
		
		
	}

}
