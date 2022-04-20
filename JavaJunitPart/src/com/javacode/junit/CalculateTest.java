package com.javacode.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateTest {

	
	@Test
	public void testSum() {
		Calculate calculate=new Calculate();
		int sum=calculate.sum(10,40);
		int testSum=50;
		
			System.out.println("@Test sum():"+ sum + " ="+ testSum);
			assertEquals(sum, testSum);
		}

}
