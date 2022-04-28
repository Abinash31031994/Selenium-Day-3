package org.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sprint.com/");
		
		Thread.sleep(3000);
		
		WebElement kk = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
		
		kk.click();
		
		WebElement lll = driver.findElement(By.xpath("//button[@class='phx-modal__close']"));
		
		lll.click();
		
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Phones & devices']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(link).perform();
		
		
		
		
		
		
		
		
	}
}
