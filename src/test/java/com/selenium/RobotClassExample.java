package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RobotClassExample extends AppConstant {

	public static void main(String[] args) throws InterruptedException, AWTException {

		driver = initBrowser();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		WebElement choose_btn = driver.findElement(By.id("imagesrc"));
		// choose_btn.click();

		Actions act = new Actions(driver);
		act.moveToElement(choose_btn).click().build().perform();

		// Upload File
		StringSelection stringSelection = new StringSelection("Desktop\\gitNotes.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Robot robot = new Robot();

		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
