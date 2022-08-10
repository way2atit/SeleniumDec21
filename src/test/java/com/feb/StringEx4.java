package com.feb;

public class StringEx4 {
	
	public static void main(String[] args) {
		
		
		String v1 = "Pune";  //  SCP -- 1111
		String v2 = new String(v1); // Heap -- 5555 + Scp :1111 
		String v3 = "Pune"; // SCP : 1111
		
		String v4 = v2;  //// Heap -- 5555 + Scp :1111
		String v6 = new String(v2); // Heap : 7777  +scp : 1111
		
		System.out.println(v2 == v6  );
		
		//  .equal :  scp   
		
		
		/*
		String v5 = v1;
		
		System.out.println(v1.equals(v4)); //  
		System.out.println(v2.equals(v1)); //
		System.out.println(v3 == v4); //  
		System.out.println(v2 == v3); // F
		
		// ==  : Adrress
*/		
	
				
	}

}
