package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WindowHandlingExample extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = initBrowser();
		driver.get("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(1000);
		
		WebElement btn1 =driver.findElement(By.xpath("//a[text() = \"Open New Seperate Windows\"]"));
		btn1.click();
		
		Thread.sleep(1000);
		
		String url_1 = driver.getCurrentUrl();
		System.out.println("Parent getCurrentUrl :"+url_1);
		
		String p_Id =driver.getWindowHandle();
		System.out.println("Parent ID :" +p_Id);
		
		
		WebElement btn2 =driver.findElement(By.xpath("//button[text() = \"click\"]"));
		btn2.click();
		//new -child window open
		//
		
		Set<String> allid =driver.getWindowHandles(); // 2
		System.out.println("All window Id size : "+allid.size());
		
		String child_id1 ="";
		for(String id :allid) // pid - child
		{
			//System.out.println("Id is :" +id);
			if(id.equals(p_Id))
			{
				
			}
			else {
				child_id1 = id;
			}
		}
		
		System.out.println("Child Id :"+child_id1);
		
		driver.switchTo().window(child_id1);
		
		
		
		String url2 =driver.getCurrentUrl();
		System.out.println("Child Title : "+url2);
		
		//open tab--
		// 
		driver.switchTo().window(p_Id); // Switch to parent
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open('https://www.google.com/')");
		
		// 3 - window
		String child_id2 = "";
		Set<String> allid3 =driver.getWindowHandles(); // 3
		
		for(String s : allid3)
		{
			if(s.equals(p_Id) || s.equals(child_id1))
			{
				
			}
			else {
				child_id2 = s;
			}
		}
		driver.switchTo().window(child_id2);
		String url1 =driver.getCurrentUrl();
		System.out.println(""+url1);
		
		
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
	}

}
