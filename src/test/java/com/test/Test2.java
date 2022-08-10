package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.AppConstant;

public class Test2 extends  AppConstant{

	@Test(priority = 1) //(dependsOnMethods = {"logintest"})
	public void admintest() {
		System.out.println("Admin Test");
		driver.findElement(By.id("admin")).click();

	}
	
	@Test
	public void logintest() {
		
		System.out.println("Login Test");
		driver = initBrowser();
		driver.get("https://www.facebook.com/");
		//username-- 
		driver.findElement(By.id("xyz")).sendKeys("abc");
		
		// login btn - click

	}
	
}
