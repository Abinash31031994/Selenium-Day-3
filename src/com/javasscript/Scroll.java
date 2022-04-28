package com.javasscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Australia']"));
		
		executor.executeScript("arguments[0].scrollIntoView(true)", down);
		
		
		
		WebElement wash = driver.findElement(By.xpath("//span[text()='Washing machines']"));
		
		executor.executeScript("arguments[0].scrollIntoView(false)", wash);
		
		
		
		
		
		
		
		
		
		
	}

}
