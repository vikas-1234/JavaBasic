package com.seygen.java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> cars=new ArrayList<String>();
//		cars.add("Valvo");
//		cars.add("BMW");
//		cars.add("Ford");
//		cars.add("Marza");
////		for (int i = 0; i < cars.size(); i++) {
////			System.out.println(cars.get(i));
////		}
//		for (String i : cars) {
//			System.out.println(i);
//			
//		}
		
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(10);
		number.add(35);
		number.add(20);
		number.add(25);
		number.add(50);
//		number.addAll(12, number);
		number.ensureCapacity(100);
//		number.iterator();
		Collections.sort(number);
		
		for (Integer i : number) {
			System.out.println(i);
		}
	}

}
