package com.feb;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> setobj = new LinkedHashSet<Integer>();
		setobj.add(10);
		setobj.add(20);
		setobj.add(30);
		setobj.add(40);
		setobj.add(null);
		setobj.add(null);
		setobj.add(null);
		setobj.add(null);
		setobj.add(100);
		setobj.add(60);
		setobj.add(30);
		setobj.add(40);
		
		System.out.println("Before : "+setobj);
		System.out.println(setobj.size());
		
		for(Integer i : setobj)
		{
			System.out.println(i);
		}
		
		
		
		
		/*setobj.clear();
		System.out.println("after :" +setobj);*/
		
		
	}

}
