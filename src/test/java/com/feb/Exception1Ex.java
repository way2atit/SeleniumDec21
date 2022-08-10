package com.feb;

public class Exception1Ex
{
	public static void main(String[] args) throws ArithmeticException, NullPointerException, InterruptedException, Exception {
		System.out.println("main method --- 1 ");
		m1();
	}

	public static void m1()throws ArithmeticException, NullPointerException, Exception, InterruptedException {
		System.out.println("m1 call --- 1");
		m2(); //ex
		
		/*try {
		  m2();  //  ex
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
		}*/
		System.out.println("m1 call --- 2");
		
		Exception e1 = new Exception();
		
		
		
		ArithmeticException obj = new ArithmeticException();
		throw obj;

	}

	public static void m2()throws ArithmeticException {
		System.out.println("m2 call ---- 1");
		
		int re = 10 / 0;  //
		
		System.out.println("m2 call ---- 2");
		
		

	}

}
