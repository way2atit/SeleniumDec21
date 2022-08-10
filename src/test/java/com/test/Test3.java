package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.AppConstant;

public class Test3 extends AppConstant {
	@Test(priority =0 )
	public void laptop_click() throws InterruptedException
	{
		System.out.println("m1");
		
		driver = initBrowser();
		driver.get("https://demoblaze.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Laptops123\"]")).click();
	}

	@Test(priority =1 , dependsOnMethods = "laptop_click" , alwaysRun = true)
	public void laptop_list()
	{
		System.out.println("laptop_list");
		
		List< WebElement> all_laptops =driver.findElements(By.xpath("//div[@id=\"tbodyid\"]//h4/a"));
		for(WebElement e :all_laptops)
		{
			System.out.println(e.getText());
		}
	}

}
