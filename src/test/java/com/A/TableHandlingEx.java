package com.A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.AppConstant;

public class TableHandlingEx  extends AppConstant {
	
	public static void main(String[] args) {
		
		WebDriver driver =initBrowser();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	
		List<WebElement> allhead =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
	
		int count =0 ;
		
		for(int i = 5 ; i<=10 ;i++)
		{
			System.out.println(""+allhead.get(i).getText());
		}
		
		
		/*for(WebElement head :allhead)
		{
			String value =head.getText();
			System.out.println("All Company :"+value);
			count++;
			if(count==5)
			{
				break;
			}
		}
	*/
	
	}

}
