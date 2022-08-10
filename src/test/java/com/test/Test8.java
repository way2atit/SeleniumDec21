package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test8 {
	String url = "facebook.com";
	
	@Parameters("username")
	@Test
	public void firefoxBrowser(String uname)
	{
		System.out.println(" firefoxBrowser " +uname);
	}

}
