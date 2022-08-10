package com.feb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CursorsExample2 {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("L");
		set.add("U");
		set.add("P");
		set.add("W");
		System.out.println(set); 
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String s =it.next();
			System.out.println(s);
		}
		
		
		
	
		
		
		
		
		
		
	}
	

}
