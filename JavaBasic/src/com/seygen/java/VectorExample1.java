package com.seygen.java;

import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		
		//creteing an empty vector
		Vector<Integer>  in=new Vector<Integer>();
		
		// Add element in the vector
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(400);
		in.add(500);
		in.add(600);
		in.add(700);
		in.add(800);
		in.add(900);
		
		
		// display the vector elements
		
		System.out.println("Values in the vector:"+in);
		
		
		// use remove() method to delete the first occurence of an elements
		System.out.println("Remove first occurence of element 200:"+in.remove(1));
		
		// Display the vector elements after remove() method
		System.out.println("Values in vector:"+in);
		
		// Remove the element at index 4
		System.out.println("Remove element at index 4:"+in.remove(4));
		
		System.out.println("New Value list in vector:"+in);
		
		// Remove an element
		in.removeElementAt(5);
		
		// Checking vector and displays the element
		System.out.println("Vector element after removal:"+in);
		
		// Get the hashcode for this vector
		
		System.out.println("Hash code of this vector:"+in.hashCode());
		
		// Get the element at specified index
		System.out.println("Element at index 1 is:"+in.get(1));

	}

}
