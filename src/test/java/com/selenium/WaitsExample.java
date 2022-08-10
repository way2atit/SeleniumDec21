package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsExample {
	/*
	 * Thread.sleep()  : JAVA Class
	 * Wait   (Interface): Selenium 
	 *1. Implicit  :  Driver -- 0sec   -- Syntax
	 *2. Explicit  :  Elements -- 0.5sec   --syntax
	 */
	
	 //                    Thread.sleep  Implicit (10sec)
	/*  Fname :   2sec        3sec          2sec -  
	 *  lname :   2sec        10sec         1sec
	 *  mb     :  2sec        3sec           2sec
	 *  City   :  2sec        3sec           2sec
	 *  
	 *  dropDown:  15Sec 
	 *  ----------------------------------------
	 *            7 / 8sec    12sec          7/8 sec
	 * 
	 */
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
	}
	

}
