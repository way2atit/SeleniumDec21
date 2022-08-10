package com.selenium;

import org.openqa.selenium.By;

public class FramesHandlingExample extends AppConstant{
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = initBrowser();
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0); // index
		driver.switchTo().frame("singleframe");
		
		
		
		// elem-- Inside frame
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("ABC");
		
		
		
		
		
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
