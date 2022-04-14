package com.seygen.java;

import java.util.ArrayList;

public class EqualsExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="Vikas";
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Vikas");
		list.add("Bablu");
		list.add("Atul");
		list.add("Ashish");
		
		for (String str : list) {
			if (str.equals(str1)) {
				System.out.println("Vikas is present");
				
			}
			
		}
	}

}
