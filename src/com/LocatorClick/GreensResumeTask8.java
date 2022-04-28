package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensResumeTask8 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
	
	WebDriver resume = new ChromeDriver();
	
	resume.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement kl = resume.findElement(By.id("heading201"));
	
	kl.click();
	
	WebElement kj = resume.findElement(By.xpath("//a[contains(text(),'Model Resume training in chennai')]"));
	kj.click();
	
	
	
}
	
	
}
