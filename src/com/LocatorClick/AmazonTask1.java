package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		
		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("https://www.amazon.in/");
		
		
		WebElement qa = amazon.findElement(By.id("twotabsearchtextbox"));
		
		
		qa.sendKeys("iphone");
		
		WebElement qw = amazon.findElement(By.id("nav-search-submit-button"));
		
	qw.click();
		
		
		
		
		
		
		
		
	}
	

}
