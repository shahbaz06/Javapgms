package com.GeneralJavapgm.JavaPgms;

public class FindMaxNo {

	public static void main(String[] args)
	{
		int [] No= {1,2,3,4,27,9,11,5,13,17,14,19,22};
//		int min=0;
//		for (int i = 0; i < No.length; i++) 
//		{
//			int  max= 0;
//			for (int j = 0; j < No.length-1; j++)
//			{
//				if(No[i]<No[j])
//				{
//					max=max+1;
//					break;
//				}
//			}
//			if(max==0)
//			{
//				min=No[i];
//			}
//			System.out.println(min);
//		}
		int limit=0;
		for (int i = 0; i < No.length; i++)
		{
			int a=0;
			for (int j = 0; j < No.length; j++) 
			{
					if(No[i]<No[j])
					{
						a=a+1;
						break;
					}
					
			}
			if(a==0)
			{
				limit=No[i];
			}
			
		}

		System.out.println(limit);
		
	}

}
