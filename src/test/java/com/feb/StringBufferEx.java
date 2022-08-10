package com.feb;

public class StringBufferEx {
	
	// StringBuffer :Mutable  Class -- 1.2  -- fast
	//StringBuilder :Mutable  Class --  1.5 --  slow
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("java"); // Heap
		StringBuilder sb2 = new StringBuilder("java"); // Heap
		
		StringBuilder sb3 = sb1;
		StringBuilder sb4 = sb1;
		
		System.out.println("sb1 : " +sb1);
		System.out.println("sb3 : " +sb3);
		System.out.println("sb4 : " +sb4);
		
		sb1 = sb1.append("selenium");  // javaselenium
		
		System.out.println("sb1 : " +sb1); //javaselenium
		System.out.println("sb3 : " +sb3); // javaselenium
		System.out.println("sb4 : " +sb4);
		
		
		
		
		
	/*	System.out.println(sb1.equals(sb3)); //
		System.out.println(sb1 == sb3);*/
		
		
		
	/*	System.out.println(sb1.equals(sb2)); //
		System.out.println(sb1 == sb2);*/
		
		
	}

}
