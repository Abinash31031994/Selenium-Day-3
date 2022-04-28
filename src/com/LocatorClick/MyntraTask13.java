package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask13 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver mynt = new ChromeDriver();
		
		mynt.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		//WebElement df = mynt.findElement(By.className("form-control mobileNumberInput"));
		
		
		
		
		WebElement jkl = mynt.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		jkl.sendKeys("8870716563");
		
		WebElement ijk = mynt.findElement(By.className("submitBottomOption"));
		ijk.click();
		
	
	
	}

}
