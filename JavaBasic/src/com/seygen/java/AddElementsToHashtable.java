package com.seygen.java;

import java.util.Hashtable;

public class AddElementsToHashtable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht1=new Hashtable<Integer, String>();
		Hashtable<Integer, String> ht2=new Hashtable<Integer, String>();
		
		// Inserting the Element using put() method
		
		ht1.put(1,"One");
		ht1.put(2,"Two");
		ht1.put(3,"Three");
		
		
		ht2.put(4,"Four");
		ht2.put(5,"Five");
		ht2.put(6,"Six");

			
		// Print Mappings to the console
		System.out.println("Mapping of ht1:"+ ht1);
		System.out.println("Mapping of ht2:"+ ht2);
		
		// Print size and content
		
		System.out.println("Size of map is: - "+ ht1.size());
		System.out.println(ht1);
		
		System.out.println("Size of map is: - "+ ht2.size());
		System.out.println(ht2);
		
		
		// CHeck if a key is present and id present, print value
	}

}
