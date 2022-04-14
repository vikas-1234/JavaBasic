package com.seygen.java;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
}






public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating user-defined class objects
		
		Student s1=new Student(101,"Vikas",24);
		Student s2=new Student(102,"Suraj",25);
		Student s3=new Student(103,"Ravi",26);
		
		// Creating Arraylist
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
	
		// Getting Iterator
		
		Iterator itr=al.iterator();
		
		  //traversing elements of ArrayList object  
		while (itr.hasNext()) {
		Student st=(Student)itr.next();
		System.out.println(st.rollno+ " "+st.name+" "+st.age);
		}
		
	}

}
