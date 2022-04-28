package com.keyUpkeyDowm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("http://greenscart.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement txtemail = driver.findElement(By.id("loginEmailId"));
	
	txtemail.sendKeys("starabi007@gmail.com");
	
	WebElement txtpass = driver.findElement(By.id("loginPassword"));
	
	txtpass.sendKeys("Abinash@31");
	
	WebElement btnlogin = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
	
	btnlogin.click();
	
	Thread.sleep(2000);
	
	WebElement lnkmobi = driver.findElement(By.id("typeahead-basic"));
	
lnkmobi.sendKeys("Apple Iphone 12");
	

	Robot robot = new Robot();
	
	Thread.sleep(2000);
	
	robot.keyPress(KeyEvent.VK_TAB);
	
	robot.keyRelease(KeyEvent.VK_TAB);
	
	WebElement buy = driver.findElement(By.xpath("//button[@class='btn btn-warning btn-long buy buttonKart']"));
	
	buy.click();
	
	Thread.sleep(3000);
	WebElement addc = driver.findElement(By.xpath("//button[@class='btn btn-block btn-outline-primary btn-lg']"));
	
	addc.click();
	
	Thread.sleep(7000);
	
	WebElement code = driver.findElement(By.xpath("//span[@class='border border-success px-3 rounded code']"));

	Actions action = new Actions(driver);
	Thread.sleep(7000);
	
	action.doubleClick(code).perform();
	
	WebElement right = driver.findElement(By.xpath("//span[@class='px-1 close']"));
	

	action.contextClick(right).perform();
	Thread.sleep(7000);
	WebElement findElement = driver.findElement(By.xpath("//section[@class='user-menu ng-star-inserted']"));
	findElement.click();	
	
}
	
}
