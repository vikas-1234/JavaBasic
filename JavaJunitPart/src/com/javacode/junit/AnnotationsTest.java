package com.javacode.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class AnnotationsTest {

		ArrayList<String> testList=new ArrayList<String>();
		@Test
		@BeforeClass
		
		public static void onceExecutedBeforeAll() {
			System.out.println("@BeforeClass: onceExecutedBeforeAll");
		}
		
		@Before
		@Test
		public void executedBeforeEach() {
			System.out.println("@Before: ExecutedBeforeEach");
		}
		@Test
		@AfterClass
		
		public static void onceExecutedAfterAll() {
			System.out.println("@AfterClass: onceExecutedAfterAll");
		}
		
		@After
		@Test
		public void executedAfterEach() {
			testList.clear();
			System.out.println("@After:executedAfterEach");;
		}
		
		@Test
		public void EmptyCollection() {
			assertTrue(testList.isEmpty());
			System.out.println("@After:executedAfterEach");
		}
		
		@Test
		public void OneItemCollection() {
			testList.add("oneItem");
			assertEquals(1, testList.size());
			System.out.println("@Test:OneItemArrayList");
		}
		
		@Test
		@Ignore
		public static void executionIgnored() {
			System.out.println("@Ignore: This execution is ignored");
		}
}
