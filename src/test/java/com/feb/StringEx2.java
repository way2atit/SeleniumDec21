package com.feb;

public class StringEx2 {
	
	public static void main(String[] args) {
		String s1 =  "car"; //  4444
		String s2 =  "BMW";
		String s3 =  "car";  // 4444
		String s4 =  s2;
		String s5 =  "Car"; // 6666
		
		
		System.out.println(s1 == s3);
		
	//	System.out.println( s1.equals(s5));
		
		System.out.println(s1); //  car
		s1=  "bus";
		System.out.println(s1); // bus
		
		
		
		
	}

}
