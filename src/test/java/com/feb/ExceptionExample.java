package com.feb;

public class ExceptionExample {

	public static void main(String[] args) {

		String value = "";
		String value1 = null;

		// System.out.println( value.length()); //0
		// System.out.println(value1.length());// NullPointerException

		System.out.println(value.concat("Hello"));

		try 
		{
			// NullpointerEx
			// ArrayIndexOutOfBoundsException
			//System.out.println(value.charAt(15)); // Ex --open
		}
		
		catch (StringIndexOutOfBoundsException e)
		{
			// --1 ---
			System.out.println("StringIndexOutOfBoundsException");

		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException");

		} 
		catch (Exception e) {
			System.out.println("Exception");

		}
		
		

		System.out.println(value.toUpperCase());

		System.out.println(value.toLowerCase());

	}

}
