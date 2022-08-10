package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test7 {
	String url = "facebook.com";
	
	
	@Parameters("url")
	@Test
	public void chormeBrowser(String value)
	{
		System.out.println(" chormeBrowser " +value);
		
	}

}
