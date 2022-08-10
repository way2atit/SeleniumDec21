package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	// dataProvider : 
	// RT : Object 2 dimensional array
	
	@DataProvider
	public Object[][]  data()
	{
		Object[][] obj = new Object[2][2];
		obj[0][0] ="username";
		obj[0][1] = "pass";	
		
		obj[1][0] ="admin";
		obj[1][1] = "admin123";
		
		return obj;
	}
	//       0         1
	//   0  username  pass  
	//   1  admin     admin123
	
	// 0    fanm lname mb  city pincode email 
	//1
	 //2
	//3
	//4
	
	
	
	@Test(dataProvider = "data")
	public void login_test(String uname , String pass) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		Thread.sleep(1000);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		
	}


}
