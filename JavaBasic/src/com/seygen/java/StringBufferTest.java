package com.seygen.java;
public class StringBufferTest {

	
	

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
//		sb.append("Vikas Pandey");
//		sb.insert(1, "java");
		sb.replace(1,2,"java");
		
		System.out.println(sb);
	}

	

}
