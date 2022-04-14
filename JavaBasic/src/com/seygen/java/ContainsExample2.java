package com.seygen.java;

public class ContainsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hello Javatpoint readers";  
	        boolean isContains = str.contains("Javatpoint");  
	        System.out.println(isContains);  
	        // Case Sensitive  
	        System.out.println(str.contains("javatpoint")); // false
	}

}
