package com.seygen.java;

public class CharAtExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to javatpoint portal";
		for (int i = 0; i < str.length()-1; i++) {
			if (i%2==0) {
				System.out.println("char at: " + i + " place : "+str.charAt(i));
				
			}
			
		}
	}

}
