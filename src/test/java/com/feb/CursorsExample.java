package com.feb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CursorsExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		System.out.println(list); 
		
		// Iteartor
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) //chk  cond 
		{
			Integer i =it.next();
			//System.out.println(i);
			
			if(i == 70)
			{
				it.remove();
			}
			
			
		}
		
		
		System.out.println(list); 
		
		//  ListIterator 
		
		ListIterator<Integer> list_it = list.listIterator();
		while(list_it.hasNext())
		{
			Integer i = list_it.next();
			System.out.println(i);
		}
		//------------------------------
		System.out.println(" hasPrevious ");
		while(list_it.hasPrevious())
		{
			Integer i =list_it.previous();
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		//-------------------------------------
		
		/*for(Integer v : list)
		{
			System.out.println(v);
			
		}*/
		
		
		
		/*for(int i =0 ; i < list.size(); i++)
		{
			Integer value =list.get(i);
			System.out.println(value);			
			if(value == 40)
			{
				System.out.println("True");
			}			
		}*/
		
		
	
		
		
		
		
		
		
	}
	

}
