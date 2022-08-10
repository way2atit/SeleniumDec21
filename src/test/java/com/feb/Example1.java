package com.feb;

import java.io.File;
import java.io.FileInputStream;

public class Example1 {

	public static void main(String[] value1)
	{
		
		m1();

		int value = m2();
		System.out.println("value of m2 () :" + value);

		String str = m3();
		System.out.println("value of m3() :" + str);

	}

	public static void m1() {

	}

	public static int m2() {
		int i = 100;
		return i;
	}

	public static String m3() {
		return "a";
	}

}
