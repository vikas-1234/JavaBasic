package com.seygen.java;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="Sachin";
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s);
//		System.out.println(s.trim());
//		System.out.println(s.startsWith("Sa"));
//		System.out.println(s.endsWith("t"));
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(3));
//		System.out.println(s.length());
		
		int a=10;
		String s=String.valueOf(a);
		System.out.println(s+10);
		
		
		String s1=new String("Java is a programming language. Java is a platform. Java is an Island.");
		String replaceString=s1.replace("Java","Kava");
		System.out.println(replaceString);
		
		
	}

}
