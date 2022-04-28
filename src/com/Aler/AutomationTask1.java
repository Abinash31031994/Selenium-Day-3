package com.Aler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class AutomationTask1 {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement btnclick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		
		btnclick.click();
		
		Thread.sleep(3000);
		
		WebElement click = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		click.click();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("Abinash");
		
		al.accept();
		
		Thread.sleep(3000);
		WebElement print = driver.findElement(By.xpath("//p[text()='Hello Abinash How are you today']"));
		
		String text = print.getText();
		System.out.println(text);
		
}
}