package com.feb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StringEx {
	
	public static void main(String[] args) {
		
		try
		{
			FileInputStream fio = new FileInputStream(new File("c://hello.java"));
			
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		
		String s1 = "java"; 
		           //0123
		
		s1.charAt(10);  // Run time -- 
		
		int num = 10/0;  //
		
		
		
		
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
		
		
		/*char[] ch_array = s1.toCharArray();
		System.out.println(" length is : "+ch_array.length);
		
		      // i = 3           
		for(int i = ch_array.length-1  ; i >= 0 ;i-- ) // 3 2 1 0
		{
			System.out.println(ch_array[i]); // 3
		}*/
		
		
		
		/*for(int i =0 ; i <ch_array.length ; i++)
		{
			System.out.println(ch_array[i]);
		}
		*/
		
		
		
		
	}

}
