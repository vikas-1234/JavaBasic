package com.seygen.java;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="Ankit"; // literals
//		System.out.println(a);
//		
//		String b="Ankit"; // literals
//		System.out.println(b);
//		
//		// immutable concept here
//		a=a.concat("kumar");
//		System.out.println(a);
		
//		String a=new String("ankit");
//		System.out.println(a);
//		
//		String b=new String("ankit");
//		System.out.println(b);
//		
//		String c = a.concat("vikas");
//		System.out.println(c);
		
		String str="ANKUSH";
		String str2=new String("ANKUSH");
//		int l=str.length(); // predefined method in java for string
//		System.out.println(l);
		
		// To Uppar CAse and Lower Case
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
		
		//str==str2 check the str ref variable which object is referring and str2 is also checking the same
//		if (str==str2) {
//			System.out.println("both are equals");
//		} else {
//			System.out.println("both are not equals");
//		}
		
		//str.equals(str2) checks the parameter for the object thats it
		if (str.equals(str2)){
			System.out.println("both are equals");
		} else {
			System.out.println("both are not equals");
		}
		
		
	}

}
