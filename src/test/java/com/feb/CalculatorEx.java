package com.feb;

public class CalculatorEx {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 10;
		
		int add = i + j;
		System.out.println("Addition :" +add);
		
		
		try {
			System.out.println("Inside try");
			int div = i / j;  // Ex
			System.out.println("Division :" +div);
			String v = null; // Ex -- null pointer
			System.out.println("Division :" +v.length());
		}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			System.out.println("Inside catch");
			e.printStackTrace();
		}
		finally {
			System.out.println("inside Finally ");
		}
		
		
		
		
		
		
		
		
		
		int sub = i - j;
		System.out.println("sub :" +sub);
		
		int multi = i * j;
		System.out.println("multi :" +multi);
		
	}

}
