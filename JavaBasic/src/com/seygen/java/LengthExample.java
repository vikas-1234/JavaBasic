package com.seygen.java;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="javatpoint";  
//		String s2="python";  
//		System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
//		System.out.println("string length is: "+s2.length());//6 is the length of python string 
		
//		String str="Javatpoint";
//		if (str.length()>0) {
//			System.out.println("String is not empty and length is:"+str.length());
//			
//			
//		}
//		str="";
//		if (str.length()==0) {
//			System.out.println("String is empty now:"+str.length());
//			
//		}
		
//		
//		String str="Welcome to mumbai";
//		int size=str.length();
//		System.out.println("Reverse of the string:" + ""+str+ ""+ "is");
//		
//		for (int i = 0; i < size; i++) {
//			// printing in reverse order
//			System.out.println(str.charAt(str.length()-i-1));
//		}
		
		String str="Welcome to JavaTpoint";
		int sizeWithWhiteSpaces=str.length();
		
		System.out.println("In the string: " + "'" + str + "'");
		str.replace(" ", "    ");
		int sizeWithoutWhiteSpaces=str.length();
		
		int noOfWhiteSpaces=sizeWithWhiteSpaces-sizeWithoutWhiteSpaces;
		
		System.out.println("Total number of whitespaces present are: " + noOfWhiteSpaces);
	}

}
