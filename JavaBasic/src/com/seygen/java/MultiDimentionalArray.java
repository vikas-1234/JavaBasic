package com.seygen.java;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i <3; i++) { // for row
			for (int j = 0; j <3; j++) { // for column
				System.out.println(arr[i][j]+ " ");
			}
		System.out.println();
			
		}
	}

}
