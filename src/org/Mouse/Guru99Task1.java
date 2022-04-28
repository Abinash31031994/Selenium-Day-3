package org.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99Task1 {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	WebElement a = driver.findElement(By.xpath("//li[@id='credit2']"));
	
	WebElement s = driver.findElement(By.xpath("//ol[@id='bank']"));
	
	
	Actions actions = new Actions(driver);
	
	actions.dragAndDrop(a, s).perform();
	
	
	WebElement qa = driver.findElement(By.id("fourth"));
	
	WebElement as = driver.findElement(By.id("amt7"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(qa, as).perform();
	
	
	WebElement qw = driver.findElement(By.id("credit1"));
	
	WebElement wq = driver.findElement(By.id("loan"));
	
	
	
	Actions acts = new Actions(driver);
	acts.dragAndDrop(qw, wq).perform();
	
	WebElement az = driver.findElement(By.id("fourth"));
	
	WebElement za = driver.findElement(By.id("amt8"));
	
	Actions dd = new Actions(driver);
	
	dd.dragAndDrop(az, za).perform();
	
WebElement hhh = driver.findElement(By.xpath("//div[@class='table4_result']"));
	
	String gh = hhh.getText();
	System.out.println(gh);
	
}

}
