package com.feb;

public class StringEx3 {
	
	public static void main(String[] args) {
		
		String str1 = new String("java"); //  Heap  +scp
		String str2 = new String("java"); // Heap + scp
		
		String str3 = new  String(str1);  //
		
		String s1 = "java";  // SCp
		
		System.out.println(s1.equals(str1)); //
		System.out.println(s1 == str1);
		
		
		
		String str4 = str1;
		
		System.out.println(str1.hashCode());
		System.out.println(str4.hashCode());
		
		
		str1 ="selenium";
		
		System.out.println(str1.hashCode());
		System.out.println(str4.hashCode());
		
		/*
		System.out.println(str1 == str4);
		// == : address --  Heap
		
		System.out.println(str1.equals(str4));
		// .equals : values --- SCP
		*/
		
		
		
	}

}
