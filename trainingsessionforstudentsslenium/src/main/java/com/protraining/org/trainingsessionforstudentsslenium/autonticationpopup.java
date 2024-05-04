package com.protraining.org.trainingsessionforstudentsslenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autonticationpopup {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senay\\eclipse-workspace\\AutomationSession9th\\trainingsessionforstudentsslenium\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.get("https://the-internet.herokuapp.com/basic_auth");
    	
    	driver.manage().window().maximize();
		
    	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    	  Thread.sleep(6000);
    	  
		String text=driver.findElement(By.cssSelector("p")).getText();
		System.out.println("text");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
