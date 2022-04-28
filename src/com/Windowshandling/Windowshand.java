package com.Windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshand {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtsearchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		txtsearchbox.sendKeys("iphone 13",Keys.ENTER);
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
		
		findElement.click();
		
		/*String prtwinId = driver.getWindowHandle();
		
		System.out.println(prtwinId);
		
		
		Set<String> allwinId = driver.getWindowHandles();
		
		System.out.println(allwinId);
		
		for (String win : allwinId) {
			
		if (!(prtwinId.equals(allwinId))) {
			
			driver.switchTo().window(win);
		}	
			
		}*/
		
		
		String prtwindid = driver.getWindowHandle();
		System.out.println(prtwindid);
		
		Set<String> allwind = driver.getWindowHandles();
		
		for (String string : allwind) {
			if (!(prtwindid.equals(allwind))) {
				driver.switchTo().window(string);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement catr = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		
		
		catr.click();
		
		
		
		
	}

}
