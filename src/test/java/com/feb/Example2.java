package com.feb;

public class Example2 {
	
	
	static String s1 = "Java";
	
	int i =10;
	static int j =10;
	static boolean b;
	
	public static void main(String[] args) {
		
		
		System.out.println(b);
		
		
		Example2 e1 = new Example2();
		e1.i = 100;
		e1.j = 200;
		
		Example2 e2 = new Example2();
		e2.i = 300;
		e2.j =400;
		
		
		System.out.println(e1.i);  // 100
		System.out.println(e1.j);  // 400
		
		System.out.println(e2.i); // 300
		System.out.println(e2.j); //  400
		
	  
		
		
	}
	
	
	
	
	public void m1()  // non abstrct
	{		
	}

	

}

interface A{
	
	public void m1();
	public abstract void m2();
}


