package com.Trial;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot s = (TakesScreenshot) driver;
		
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		
	
		
		
		
		
		
}
}