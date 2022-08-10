package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {
	
	// dataProvider : 
	// RT : Object 2 dimensional array
	
	// fname lname mb city pincode email
	@DataProvider
	public Object[][]  data()
	{
		Object[][] obj = new Object[2][6];
		obj[0][0] ="fname";
		obj[0][1] = "lname";
		obj[0][2] = "mb";	
		obj[0][3] = "city";	
		obj[0][4] = "pinocde";	
		obj[0][5] = "email";	
		
		
		obj[1][0] ="fname";
		obj[1][1] = "lname";
		obj[1][2] = "mb";	
		obj[1][3] = "city";	
		obj[1][4] = "pinocde";	
		obj[1][5] = "email";	
		
		return obj;
	}
	
	
	
	@Test(dataProvider = "data")
	public void login_test(String fname , String lname ,String mb , String city , String pincode , String email ) throws InterruptedException
	{
		
		
	}


}
