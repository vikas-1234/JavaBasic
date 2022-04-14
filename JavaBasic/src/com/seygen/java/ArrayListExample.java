package com.seygen.java;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
		
		// Adding an element into an arraylist
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		
		
		// Changing an item into an arraylist
		
				cars.set(0, "opel");
				cars.set(1,"Mahindra Thar");
				cars.set(2, "Fortuner");
		// Removing an items from an arraylist
				System.out.println(cars);
				cars.remove("opel");
				
		// To remove all the element into a arraylist always use Clear() method
				
				
				System.out.println(cars);
		
		// To find the ArrayList Size
				System.out.println(cars.size());
		// Accessing an Item from an arraylist
//		
//		System.out.println(cars.get(0));
//		System.out.println(cars.get(1));
//		System.out.println(cars.get(2));
//		System.out.println(cars.get(3));
				
		System.out.println(cars.isEmpty());
		System.out.println(cars.contains("opel"));
		
		
	}

}
