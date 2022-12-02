package com.GeneralJavapgm.JavaPgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) 
	{
String [] arr={"mango","among","table","gomna","apple"};
		
		List<String> OL = Arrays.asList(arr);
		ArrayList<String> SL = new ArrayList<String>();
		ArrayList<String> ML = new ArrayList<String>();
		
		for (int i = 0; i < OL.size(); i++) {
			char [] C=OL.get(i).toCharArray();
			Arrays.sort(C);
			String SS=new String(C);
			SL.add(SS);
		}
		System.out.println("[");
		for (int i = 0; i < OL.size(); i++) {
			if(ML.contains(OL.get(i))) {
			}
			else {
				System.out.print("["+OL.get(i));
					for (int j = i+1; j < OL.size(); j++) {
						if((SL.get(i).equals(SL.get(j)))){
							System.out.print(" ,"+OL.get(j));
							ML.add(OL.get(j));
						}
						
					}
					System.out.print("]\n");
			}	
		}
		System.out.println("]");
		
	}

	}


