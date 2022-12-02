package com.GeneralJavapgm.JavaPgms;

import java.util.ArrayList;

public class MissingNo
{

	public static void main(String[] args) 
	{
int [] arr= {1,2,3,4,27,9,11,5,13,17,14,19,22};
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int k=0;

//Finding max number in the array

		int limit=0;
		for (int i = 0; i < arr.length; i++)
		{
			int a=0;
			for (int j = 0; j < arr.length; j++) 
			{
					if(arr[i]<arr[j])
					{
						a=a+1;
						break;
					}
					
			}
			if(a==0)
			{
				limit=arr[i];
			}
			
		}

		System.out.println(limit);	//Max number

//Adding all the items in an array to a list
		for (int i = 0; i < arr.length; i++)
		{
				list.add(arr[i]);	
		}

//Finding missing numbers using local variable k till limit
		while(k<=limit)
		{
			if(list.contains(k)) 
			{
				//ignore
			}
			else
			{
				System.out.println(k);
			}
			k=k+1;
//			System.out.println(k);
		}
			
	}

}
