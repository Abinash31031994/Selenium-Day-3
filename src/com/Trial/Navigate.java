package com.Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtemail = driver.findElement(By.id("email"));
		
		txtemail.sendKeys("user");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		
		txtpass.sendKeys("1234");
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		
		btnlogin.click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
	}
	
	
}
