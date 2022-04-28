package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask6 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		
		WebDriver bus = new ChromeDriver();
		
		bus.manage().window().maximize();
		
		bus.get(" https://www.redbus.in/");
		
		Thread.sleep(3000);
		
		WebElement zz = bus.findElement(By.id("signin-block"));
		zz.click();
		
		WebElement gg = bus.findElement(By.id("signInLink"));
		
		gg.click();

		Thread.sleep(3000);
		
		WebElement tt = bus.findElement(By.xpath("src"));
		
		tt.sendKeys("8870716563");
		
	}

}
