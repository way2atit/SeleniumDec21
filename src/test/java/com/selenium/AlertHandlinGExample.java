package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertHandlinGExample extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = initBrowser();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text() = \"Alert with Textbox \"]")).click();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text() = \"click the button to demonstrate the prompt box \"]")).click();
		Thread.sleep(1000);
		// Alert
		
		Alert a = driver.switchTo().alert();
		String alert_text =a.getText();
		System.out.println(" "+alert_text);
		Thread.sleep(1000);
		a.sendKeys("Admin");
		Thread.sleep(1000);
		a.accept();   // ok 
		
	//	a.dismiss();  // cancel 
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
