package com.seygen.java;

public class CharAtExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to javatpoint portal";
		int strLength=str.length();
		
//		Fetching first character
		System.out.println("character at 0 index is:"+str.charAt(0));
		
		// Fetching the last character is present at string length-l index
		System.out.println("charcter at last index is :"+str.charAt(strLength-1));
		}

}
