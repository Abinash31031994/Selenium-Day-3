package com.LocatorClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripTask7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe" );
		
		WebDriver trip = new ChromeDriver();
		
		trip.get("https://www.cleartrip.com/trains");
		
		WebElement nn = trip.findElement(By.id("from_station"));
		nn.sendKeys("Mayiladuthurai");
		
		WebElement mm = trip.findElement(By.id("to_station"));
		
		mm.sendKeys("Chennai");
		
		WebElement dd = trip.findElement(By.id("trainFormButton"));
		dd.click();
		
		
		
	}
}
