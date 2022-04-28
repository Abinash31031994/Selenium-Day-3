package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask10 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		
		
		WebDriver amazo = new ChromeDriver();
		
		amazo.get("https://www.amazon.in/");
		
WebElement v = amazo.findElement(By.xpath("//img[contains(@class,'shoveler')][1]"));
	
	v.click();
	
}	
}
