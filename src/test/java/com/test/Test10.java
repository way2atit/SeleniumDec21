package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {
	@Test
	public void firefoxBrowser()
	{
		System.out.println(" firefoxBrowser ");
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("");*/
		
	}
	
	@Test
	public void m1()
	{
		System.out.println("m1-- form test10");
	}
	
	@Test(groups = {"smoke"})
	public void m4()
	{
		System.out.println("m4-- form test10");
	}
	

}
