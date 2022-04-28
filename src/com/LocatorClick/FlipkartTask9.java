package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTask9 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		
		WebDriver fkart = new ChromeDriver();
		
		fkart.get("https://www.flipkart.com/");
		
		WebElement bn = fkart.findElement(By.className("_2IX_2-VJZDxU"));
		
		bn.sendKeys("starabi007");
		
		
		
		
	}

}
