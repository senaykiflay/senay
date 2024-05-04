package com.protraining.org.trainingsessionforstudentsslenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senay\\eclipse-workspace\\AutomationSession9th\\trainingsessionforstudentsslenium\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.get("https://www.jqueryui.com");
    	
    	driver.manage().window().maximize();
		
		
		
		
		
		
		
	}

}
