package com.seygen.java;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hello");
		String s2=new String("World");
		String s=String.format("%s%s",s1,s2);
		System.out.println(s);
	}

}
