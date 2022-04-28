package com.Contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");

		WebDriver green = new ChromeDriver();

		green.get("http://greenstech.in/selenium-course-content.html");

		green.manage().window().maximize();

		WebElement fd = green.findElement(By.id("overview-tab"));

		fd.click();

		Thread.sleep(3000);
		WebElement findElement = green.findElement(By.xpath("//div[@class='card-body']"));

		String text = findElement.getText();

		System.out.println(text);

	}

}
