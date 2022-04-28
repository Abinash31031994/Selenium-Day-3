package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask14 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
	WebDriver swiggy = new ChromeDriver();
	
	swiggy.get("https://www.swiggy.com/");
	
	WebElement kkk = swiggy.findElement(By.className("r2iyh"));
	
	kkk.click();
	WebElement aaa = swiggy.findElement(By.id("mobile"));
	aaa.sendKeys("8870716563");
	
	WebElement sss = swiggy.findElement(By.id("name"));
	sss.sendKeys("Abinash");
	
	WebElement qqq = swiggy.findElement(By.id("email"));
	qqq.sendKeys("starabi007@gmail.com");
	
	WebElement www = swiggy.findElement(By.id("password"));
	www.sendKeys("12345678");
	
	
	
	
	
	
}
	
	
}
