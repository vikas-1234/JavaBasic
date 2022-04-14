package com.seygen.java;

public class FormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Vikas";
		String s1=String.format("name is %b", name);
		String s2=String.format("name is %f", 32.33434);
		String s3=String.format("name is %32.12f",32.33434);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
			
	}

}
