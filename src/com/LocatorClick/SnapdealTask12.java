package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealTask12 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver deal = new ChromeDriver();
		
		deal.get("https://www.snapdeal.com/");
		
		WebElement fg = deal.findElement(By.xpath("span[class='accountUserName col-xs-12 reset-padding']"));
		
		fg.click();
		
		
		
		
	}
}
