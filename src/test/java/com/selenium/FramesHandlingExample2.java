package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandlingExample2 extends AppConstant{
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = initBrowser();
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		
		
		
		// Element
		driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
		
		
		
		// frame--
		WebElement frame1 =driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
		
		Thread.sleep(1000);
		driver.switchTo().frame(frame1);
		
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.xpath("/html/body//div[@class=\"container\"]//iframe"));
		
		Thread.sleep(1000);
		driver.switchTo().frame(frame2);
		
		Thread.sleep(2000);
		
		
		
		// elem-- Inside frame
		WebElement e =driver.findElement(By.xpath("//input[@type=\"text\"]"));
		e.sendKeys("ABC");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		// driver -- ouside frame
		
		
		
		WebElement home_btn =driver.findElement(By.xpath("//a[text()=\"Home\"]"));
		home_btn.click();
		
		
		
		
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
