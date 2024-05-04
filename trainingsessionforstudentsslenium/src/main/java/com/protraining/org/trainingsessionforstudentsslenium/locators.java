package com.protraining.org.trainingsessionforstudentsslenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senay\\eclipse-workspace\\AutomationSession9th\\trainingsessionforstudentsslenium\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("https://www.facebook.com");
    	
    	driver.manage().window().maximize();
		WebElement EmailField= driver.findElement(By.id("email"));
		EmailField.sendKeys("senay kiflay");
		WebElement psswrField=driver.findElement(By.name("pass"));
		psswrField.sendKeys("123senay");
	    Thread.sleep(6000);
		WebElement Forgotlk=driver.findElement(By.linkText("forgot password"));
		Forgotlk.click();
		
		

	}

}
