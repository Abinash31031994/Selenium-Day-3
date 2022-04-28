package com.table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement btncreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		btncreate.click();
		
		WebElement dropday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select select = new Select(dropday);
		
		select.selectByVisibleText("31");		
		
		WebElement dropmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s = new Select(dropmonth);
		
		s.selectByIndex(2);
		
		WebElement dropyear = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select st = new Select(dropyear);
		
		st.selectByValue("1994");
		
		boolean multiple = select.isMultiple();
		
		System.out.println(multiple);
		
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement ele = options.get(i);
			
			String text = ele.getText();
			
			System.out.println(text);
			
		}
		
		
		
		
	}
}
