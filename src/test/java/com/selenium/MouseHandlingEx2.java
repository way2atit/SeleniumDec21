package com.selenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandlingEx2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		WebElement drag_elem =driver.findElement(By.xpath("//a[text()= \" 5000 \"]"));
		
		WebElement drop_elem =driver.findElement(By.xpath("//ol[@id=\"amt7\"]/li"));
		
		 
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		act.dragAndDrop(drag_elem, drop_elem).build().perform();
		
	}

}
