package com.seygen.java;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a map using the HashMap
		Map<String, Integer> numbers=new HashMap<String, Integer>();
		
		// Inserting elements to the map
		numbers.put("One", 1);
		numbers.put("Two", 2);
		System.out.println("Map:"+ numbers);
		
		// Access key of the map
		System.out.println("keys:"+ numbers.keySet());
		
		// Acesss the value of the map
		System.out.println("Values:"+numbers.values());
		
		// Acess the entries of the map
		System.out.println("Entries:"+numbers.entrySet());
		
		// Remove Element from the map
		int value=numbers.remove("Two");
		System.out.println("Removed Value:"+value);
	}

}
