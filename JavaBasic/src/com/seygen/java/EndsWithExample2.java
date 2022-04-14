package com.seygen.java;

public class EndsWithExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Javatpoint.com";  
        System.out.println(str.endsWith("point"));  
        if(str.endsWith(".com")) {  
            System.out.println("String ends with .com");  
        }else System.out.println("It does not end with .com");
	}

}
