package com.javasscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascripts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		WebElement txtuser = driver.findElement(By.id("email"));

		executor.executeScript("arguments[0].setAttribute('value','abinash')", txtuser);

		Object executeScript = executor.executeScript("return arguments[0].getAttribute('value')", txtuser);

		System.out.println(executeScript);

		WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));

		executor.executeScript("arguments[0].setAttribute('value','1234')", txtpass);

		Object g = executor.executeScript("return arguments[0].getAttribute('value')", txtpass);

		System.out.println(g);

	}
}
