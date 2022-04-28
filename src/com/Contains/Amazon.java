package com.Contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("https://amazon.in/");
		
		WebElement zon = amazon.findElement(By.xpath("//a[contains(text(),'Sale')]"));
		
	String dd = zon.getText();
		
		System.out.println(dd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
