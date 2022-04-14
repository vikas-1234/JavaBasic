package com.seygen.java;

public class ReplaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String m1="Welcome to mumbai";
//		String replaceString=m1.replace('e','a');
//		System.out.println(replaceString);
		
//		String s1="my name is khan my name is java";  
//		String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
//		System.out.println(replaceString);
		
//		  	String str = "oooooo-hhhh-oooooo";  
//	        String rs = str.replace("h","s"); // Replace 'h' with 's'  
//	        System.out.println(rs);  
//	        rs = rs.replace("s","h"); // Replace 's' with 'h'  
//	        System.out.println(rs);
		
//		String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
//		String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
//		System.out.println(replaceString);
		
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString=s1.replaceAll("\\s","");  
		System.out.println(replaceString); 
		
			
	}

}
