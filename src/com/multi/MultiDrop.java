package com.multi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

		WebElement dropFruit = driver.findElement(By.id("fruits"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Select se = new Select(dropFruit);

		boolean multiple = se.isMultiple();

		System.out.println(multiple);

		List<WebElement> options = se.getOptions();

		for (int i = 0; i < options.size(); i++) {

			WebElement ele = options.get(i);

			String text = ele.getText();

			se.selectByVisibleText(text);

			System.out.println(text);

		}

	/*	WebElement opt = se.getFirstSelectedOption();

		String text = opt.getText();

		System.out.println(text);
	
*/
	
	/*List<WebElement> s = se.getAllSelectedOptions();
		
		for (int i = 0; i < s.size(); i++) {
			
			WebElement le = s.get(i);
			
			String atr = le.getAttribute("value");
			
			System.out.println(atr);
			
		}*/
		
se.deselectByIndex(0);	
se.deselectByValue("orange");

	se.deselectByVisibleText("Apple");
	
	Thread.sleep(3000);
	
	se.selectByVisibleText("Apple");

		
	
	
	
	
	
	
	
	}
}
