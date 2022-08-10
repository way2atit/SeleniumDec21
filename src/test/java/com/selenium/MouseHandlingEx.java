package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandlingEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement fashion_elem =driver.findElement(By.xpath("//div[text()=\"Fashion\"]"));
		
		WebElement mb_elem = driver.findElement(By.xpath("//div[text()=\"Mobiles\"]"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(fashion_elem).build().perform();
		
		//act.click(mb_elem).build().perform();
		
		//act.clickAndHold(mb_elem).build().perform();
		//Thread.sleep(2000);
		//act.release(mb_elem).build().perform();
		
		//act.contextClick(mb_elem).build().perform();
		
		
		
		
	}

}
