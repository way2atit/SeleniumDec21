package com.feb;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx {
	
	public static void main(String[] args) {
		
		//int i =10;  // Primitiv DT
		
		Integer i1 = new Integer(10); // Wrapper Class
		
		String  name;
		Integer pincode;
		
		//List<String> list_obj = new ArrayList<String>();
		
		ArrayList<Integer> array_obj = new ArrayList<Integer>();
		//  10
		array_obj.add(10);
		array_obj.add(20);
		array_obj.add(30);
		array_obj.add(40);
		array_obj.add(50);
		array_obj.add(60);
		array_obj.add(70);
		
		
		System.out.println(array_obj.size());
		
		for(Integer  i : array_obj)
		{
			System.out.println(i);
		}
		
		
		
		/*for(int i = 0; i < array_obj.size() ;i++)
		{
			System.out.println(array_obj.get(i));
		}*/
		
		
		
		
		/*array_obj.add(1, 900);
		System.out.println(array_obj);
		
		array_obj.remove(1);
		System.out.println(array_obj);
	
		System.out.println(	array_obj.get(3));*/
	}    

}
