package com.Actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshottt {
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

TakesScreenshot ts = (TakesScreenshot) driver; 

File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

System.out.println(screenshotAs);


FileHandler.copy(screenshotAs, new File("C:\\Java\\abi.png"));


}

}
