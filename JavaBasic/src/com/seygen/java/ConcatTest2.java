package com.seygen.java;

public class ConcatTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long startTime=	System.currentTimeMillis();
	StringBuffer sBuffer=new StringBuffer("Java");
	for (int i = 0; i < 10000; i++) {
		sBuffer.append("Tpoint");
		
	}
	System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	startTime=System.currentTimeMillis();
	StringBuilder sb2=new StringBuilder("Java");
	for (int i = 0; i < 10000; i++) {
		sb2.append("Tpoint");
		
	}
	System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
