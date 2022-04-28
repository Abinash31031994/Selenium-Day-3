package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechTask5 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver interview = new ChromeDriver();
		
		interview.get("http://greenstech.in/selenium-course-content.html");
		
		
		WebElement fd = interview.findElement(By.id("heading20"));
		
		fd.click();
		
		
		WebElement as = interview.findElement(By.xpath("//a[contains(text(),'CTS')]"));
		
		
		as.click();
		
		
		
		
		
		
		
		
		
	}

}
