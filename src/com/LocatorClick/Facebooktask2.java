package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktask2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver fb = new ChromeDriver();
		
		fb.get("https://www.facebook.com/");
		
		
		WebElement dd = fb.findElement(By.xpath("//input[@id='email']"));
		
		
		dd.sendKeys("starabi007");
		
		WebElement aa = fb.findElement(By.xpath("//input[@id='pass']"));
		
		aa.sendKeys("M.ABI.BE");
		
		WebElement ss = fb.findElement(By.xpath("//button[@name='login']"));
		
		ss.click();
		
		
		
		
	}
	

}
