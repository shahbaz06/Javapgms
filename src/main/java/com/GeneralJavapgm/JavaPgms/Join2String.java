package com.GeneralJavapgm.JavaPgms;

import java.util.StringJoiner;
import java.util.TreeSet;

public class Join2String {

	public static void main(String[] args) {
		String S="abcdefghi";
		String H="shahbaz";
		
		StringJoiner J=new StringJoiner("","[","]");
		 J.add(H).add(S);
		System.out.println(J);
		TreeSet<String> TT=new TreeSet<String>();
		TT.add(S);
		TT.add(H);
		System.out.println(TT);

	}

}
