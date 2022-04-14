package com.seygen.java;

public class LastIndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		String s1="this is index of example";//there are 2 's' characters in this sentence  
//		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
//		System.out.println(index1);//6 
		
//		
//		String str = "This is index of example";  
//        int index = str.lastIndexOf('s',5);  
//        System.out.println(index);
		
//		String str = "This is last index of example";  
//        int index = str.lastIndexOf("of");  
//        System.out.println(index); 
		
		String str = "This is last index of example"; 
		
        int index = str.lastIndexOf("of", 25);  
        System.out.println(index);  
        index = str.lastIndexOf("of", 10);  
        System.out.println(index); // -1, if not found  
        
        
        
        
        
		
		
	}

}
