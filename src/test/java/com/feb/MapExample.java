package com.feb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		  // key      value
		Map<Integer, String>  mapobj = new HashMap<Integer, String>();
		mapobj.put(10, "v1"); 
		mapobj.put(20, "v2"); 
		mapobj.put(30, "v3");
		mapobj.put(40, "v4");
		mapobj.put(10, "v100"); 
		
		System.out.println(mapobj);
		System.out.println(mapobj.size());
		
		// city -- STring
		// Entry<key, value>
		
		/*Set< String > allcity;
		for(String s : allcity)*/
		
		//Set< Entry<Integer, String> > allentry;
		
		
		
		
		
		
		  Set< Entry<Integer, String> > allentry=  mapobj.entrySet();
		
		
		  for(Entry<Integer, String> e : allentry)
		  {
			  Integer key = e.getKey();
			  String value = e.getValue();
			  System.out.println("key :"+key +" value :" +value);
			  
			  if(key == 40)
			  {
				  e.setValue("v400");
			  }
			 
		  }
		
		System.out.println(mapobj);
		
		
		
		
		
		
	}

}
