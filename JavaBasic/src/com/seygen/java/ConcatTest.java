package com.seygen.java;

public class ConcatTest {

		public static String concatWithString(){
			
		
		// TODO Auto-generated method stub
		String t="Java";
		for(int i=0;i<1000;i++) {
			t=t+"Tpoints";
			
		}
		return t;
	}
	
		public static String  concatWithStringBuffer() {
			StringBuffer sb=new StringBuffer("Java");
			for (int i = 0; i < 1000; i++) {
				sb.append("Tpoints");
				
			}
			return sb.toString();
			
		}
		public static void main(String[] args) {
			long startTime=System.currentTimeMillis();
			concatWithString();
			 System.out.println("Time taken by Concating with  String: "+(System.currentTimeMillis()-startTime)+"ms");
//			System.out.println("Time taken by Concating with String:"+(System.currentTimeMillis()+"ms"));
			startTime=System.currentTimeMillis();
			concatWithStringBuffer();
			 System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
//			System.out.println("Time taken by Concating with String:"+(System.currentTimeMillis()+"ms"));
		}

}
