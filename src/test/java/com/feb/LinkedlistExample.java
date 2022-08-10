package com.feb;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {
	
	public static void main(String[] args) {
		List<String> obj1 = new LinkedList<String>();
		
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("A");  // 
		obj.add("B");
		obj.add("C");
		obj.add("B");
		obj.add(null);
		obj.add(null);
		
		System.out.println(obj);
		
		for(String s : obj)
		{
			System.out.println(s);
		}
		
		
		
		obj.add(1, "Z");
		System.out.println(obj);
		
		
		
	}

}
