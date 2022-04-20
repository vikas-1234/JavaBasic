package com.seygen.java;

import java.util.Hashtable;

public class MapTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
//		Hashtable<String, Integer> ht1=new Hashtable<String, Integer>();
//		
//		// Adding element to the hashtable
//		ht.put("Vishal", 10);
//		ht.put("Sachin", 30);
//		ht.put("Vaibhav", 20);
//		
//		// Print size and content
//		System.out.println("Size of map is:"+ht.size());
//		System.out.println(ht);
//		
//		
//		// Check if a key is present and if present , print value
//		
//		if (ht.containsKey("vishal")) {
//			Integer a=ht.get("vishal");
//			System.out.println("Value for key" + " \"vishal\" is:-" + a);
//			
//		}
		
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
        
        ht1.put(1, "Geeks");
        ht1.put(2, "Geeks");
        ht1.put(3, "Geeks");
        ht1.put(4, "For");
        
        ht2.put(1, "Geeks");
        ht2.put(2, "Geeks");
        ht2.put(3, "Geeks");
        ht2.put(4, "For");
        
        // Print mappings to the console
        System.out.println("Mapping of ht1:"+ht1);
        System.out.println("Mapping of ht2:"+ht2);
        
        // Update the value at key 2
        ht1.put(2, "for");
        ht2.put(2, "for");
        
        // Print the updated map
        System.out.println("Updated Map1:"+ht1);
        System.out.println("Updated Map1:"+ht2);
        
        
        // Remove the map entry with key 4
        ht1.remove(2);
        ht2.remove(2);
        
        // Final Hashtable the updated map
        System.out.println("Updated Map1:"+ht1);
        System.out.println("Updated Map1:"+ht2);
        
        
        
	}

}
