package com.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority = 0)
	public void loginTest()  // 0
	{
		System.out.println("loginTest call");
		// login page code ..
		// username add
		// pas add
		// login btn click
		
	}
	@Test(priority = 1)
	public void dashboardTest()  // 0
	{
		System.out.println("dashboardTest call ");
		assertTrue(false);
		// driver.
	}
	
	@Test(priority = 2 , invocationCount = 5 )
	public void adminTest() {
		System.out.println("AdminTest Call");
	}
	
	@Test(enabled = false)
	public void mobile_search()
	{
		// mb.
		// list : 
	}
	
	
	
	
	

}
