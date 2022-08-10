package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {
	
	
	
	
	@Test
	public void chormeBrowser()
	{
		System.out.println(" chormeBrowser ");
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");*/
		
	}
	
	@Test  //(enabled = true)
	public void m1()
	{
		System.out.println("m1-- form test9");
	}
	
	@Test
	public void m2()
	{
		System.out.println("m2-- form test9");
	}
	@Test
	public void m3()
	{
		System.out.println("m3-- form test9");
	}
	
	@Test(groups = {"smoke"})
	public void m4()
	{
		System.out.println("m4-- form test9");
	}
	
	@Test(groups = {"smoke" ,"Regrssion"})
	public void m5()
	{
		System.out.println("m4-- form test9");
	}
	
	
	
	
	

}
