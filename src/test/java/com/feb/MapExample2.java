package com.feb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	
	public static void main(String[] args) {
		  // key      value
		Map<String, String>  alllinks = new HashMap<String, String>();
		alllinks.put("facebook", "https://www.facebook.com/");
		alllinks.put("amazon", "https://www.amazon.in/");
		alllinks.put("Flipkart", "https://www.flipkart.com/");
		alllinks.put("IRCTC", "https://www.irctc.co.in/nget/train-search");
		alllinks.put("Skype", "https://www.skype.com/en/");
		
		
		System.out.println(alllinks);
				
		Set<Entry<String, String>> entry1 =alllinks.entrySet();
		
		for( Entry<String, String> e: entry1)
		{
			String linkname = e.getKey();
			System.out.println(linkname);
		}
		
		
	}

}
