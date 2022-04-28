package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask11 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver google = new ChromeDriver();
		
		google.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
		WebElement ll = google.findElement(By.id("firstName"));
		
		ll.sendKeys("Abinash");
		
		WebElement kk = google.findElement(By.id("lastName"));
		
		kk.sendKeys("Murugan");
		
		
		WebElement qaz = google.findElement(By.id("username"));
		
		
		qaz.sendKeys("starabi007");
		
		
		WebElement wd = google.findElement(By.name("Passwd"));
		wd.sendKeys("12345678");
		
		WebElement dc = google.findElement(By.name("ConfirmPasswd"));
		dc.sendKeys("12345678");
		
		WebElement hh = google.findElement(By.id("yDmH0d"));
		hh.click();
		
		
		
		
		
		
		
	}
	
	
}
