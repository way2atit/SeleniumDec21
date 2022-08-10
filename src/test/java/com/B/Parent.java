package com.B;

public class Parent {
	// Static vs Instance Vs Local
	//  declaration 
	//  Method area -- Heap -- Stack
	//  Class Level -- Object--- call that method
	//   initi- not mand -- Not Mand.   --- yes  (Final variable )
	//    
	// s-s :   no obj
	// I-I : No obj
	// S-I:  No obj
	// I - S :  Obj creation mad.
	
	
	//------------Abstract class Vs Interface
	//  Abstrct method/ non-abstrct --   Abstrct method 
	// not 100% abstcrt class         --  100% abstcrt
	
	//varibales : No Rule          -- Public static final
	
	// no object                   -- no object creation
	
	// Constructor : present          -- no constr.
	
	// keyword : abstcrt mand.            --Not mand.
	
	
	
	public void m1() 
	{
		System.out.println("m1 from parent");
	}
	
	public static void m2() {
		System.out.println("m2 from parent");
	}
	
	public void m3() {
		System.out.println("m3 from parent");
	}
	
	
	public static void main(String[] args) {
		
		Parent pc = new Child();
		pc.m1();
		pc.m2();
		
		
	}

}

class Child extends Parent{
	
	
	public void m1() {
		System.out.println("m1 from Child");
	}
	
	public static void m2() {
		System.out.println("m2 from child");
	}
	
	public void m4() {
		System.out.println("m4 from child");
	}
	
	
}
