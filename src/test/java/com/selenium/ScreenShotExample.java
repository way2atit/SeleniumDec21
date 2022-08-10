package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotExample extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = initBrowser();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		getmyscreenShot("amazon");
		
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();
		// Mobile Page
		getmyscreenShot("amazon_mobile");
		
	}

	public  static void getmyscreenShot(String name) throws IOException
	{
		TakesScreenshot src =(TakesScreenshot) driver;
		File srcfile = src.getScreenshotAs(OutputType.FILE);
		
		
		// amazon-09-04 -2022 -09-39-30
		
		
		String path = "F:\\ScreenShots\\" + name +  ".png";
		
		File dec_file = new File(path);
		
		FileUtils.copyFile(srcfile, dec_file);
	}
	
	
}
