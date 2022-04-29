package com.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinTask1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDay3\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		robot.keyPress(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_B);
		
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
		
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		
		robot.keyPress(KeyEvent.VK_3);
		robot.keyRelease(KeyEvent.VK_3);
		
		robot.keyPress(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_4);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}

}
