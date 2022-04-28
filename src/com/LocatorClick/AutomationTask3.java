package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTask3 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver auto = new ChromeDriver();
		//http://demo.automationtesting.in/Register.html
		auto.get(" http://demo.automationtesting.in/Register.html");
		
		
		WebElement ddd = auto.findElement(By.className("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
		
		ddd.sendKeys("Abinash");
		
		
		
		
		
		
		
		
		
	}
}
