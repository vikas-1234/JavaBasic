package com.seygen.java;

public class Testarray {
	
//	static void min(int arr[]) {
//		int min=arr[0];
//		for (int i = 1; i < arr.length; i++)
//			if (min>arr[i]) 
//				
//			min=arr[i];
//			
//		System.out.println(min);	
//		
//	}
	
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]=new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
//		int arr[]= {101,102,103,104,105};
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
//		int a[]= {101,102,103,104,105};
//		min(a);
		
		printArray(new int[]{10,22,44,66});
		
	}

}
