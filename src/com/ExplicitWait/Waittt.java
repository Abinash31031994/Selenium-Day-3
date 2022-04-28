package com.ExplicitWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class Waittt {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//WebElement btncrt = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		//btncrt.click();
		
		//WebDriverWait driverwait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		//Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		WebDriverWait dwait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement txtuser = dwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		txtuser.sendKeys("nash");
		
		
		
	}
}
	
	
	
	
	
	
	
