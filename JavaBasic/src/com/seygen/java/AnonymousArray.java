package com.seygen.java;

public class AnonymousArray {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new int[] {10,22,44,66});
	}

}
