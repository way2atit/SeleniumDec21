package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {
	WebDriver driver =null;

	@Test
	public void facebookLoginTest() {
		System.out.println("loginTest Test");
	}

	@Test
	public void amazonLoginTest() {
		System.out.println("adminTest Test");
	}

	@BeforeMethod
	public void m2() {
		 System.out.println(" @BeforeMethod ");
	}

	@AfterMethod
	public void m3() {
		System.out.println(" @AfterMethod ");
	}
	
	@BeforeClass
	public void m4()
	{
		System.out.println(" @BeforeClass ");
		
	}
	
	@AfterClass
	public void m5()
	{
		System.out.println(" @AfterClass ");
		//driver.close();
	}
	
	@BeforeTest
	public void m6()
	{
		System.out.println(" @BeforeTest ");
	}
	
	@AfterTest
	public void m7()
	{
		System.out.println(" @AfterTest ");
	}
	
	@BeforeSuite
	public void m8()
	{
		System.out.println(" @BeforeSuite ");
		
	}
	
	@AfterSuite
	public void m9()
	{
		System.out.println(" @AfterSuite ");
	}
	
	
	
	

}



//  BS --BT -- BC --BM -- -- @Test -- AM -- AC-- AT --AS


