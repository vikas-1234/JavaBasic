package com.seygen.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Accessing the element
		System.out.println("Returninv Element:"+list.get(0));
		
		// Changing the element
		list.set(1, "Dates");
		for ( String fruit : list) {
			System.out.println(fruit);
		}
		System.out.println("Sorting Numbers:");
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		
//		 Sorting the list
		Collections.sort(list2);
		
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		
		
		
		
		
		
		
		
		
//		Iterator itr=list.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		
//		for (String fruit : list) {
//			System.out.println(fruit);
//		}
//		
//	}
	}

}
