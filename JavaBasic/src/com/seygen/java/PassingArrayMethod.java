package com.seygen.java;

public class PassingArrayMethod {

	// creating a method which receives an array as a parameter
	 static void min(int arr[]) {
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) 
			if (min>arr[i])
				min=arr[i];
				
			
		System.out.println(min);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {10,5,20,45,56,60};
	min(arr);
	
	
	}

}
