package com.seygen.java;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1=new StringBuilder("Hello");
		StringBuilder s2=new StringBuilder("World");
		StringBuilder s3=s1.append(s2);
		System.out.println(s3.toString());
	}

}
