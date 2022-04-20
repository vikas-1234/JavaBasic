package com.seygen.java;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class DivisionTestCase {

	//called only once, before starting all the test cases.
//	@BeforeClass
//	public static void BeforeClass() {
//		System.out.println("In BeforeClass Method");
//	}
//	
//	
//	//called only once, after finishing all the test cases.
//	@AfterClass
//	public static void afterClass() {
//		System.out.println("I am AfterClass Method");
//	}
	
	
	//called before each test case.
	@Order(0)
	@Test
	public void before() {
		System.out.println(" I am Order 0");
	}
	
	//called after each test case.
	@Order(1)
	@Test
	public void after() {
		System.out.println("In Order1");
		
	}
	
	//define the test case.
	@Test
	public void testCases1() {
		System.out.println("In TestCases1");
		
	}
	
	////define the test case
	@Test
	public void testCases2() {
		System.out.println("In TestCases2");
	}
	
	// Ignore the test case. It will not execute
	@Ignore
	@Test
	public void testCases3() {
		System.out.println("In TextCases3");
	}
	
	
	
	
	
	
}
