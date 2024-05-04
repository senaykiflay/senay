package com.protraining.org.trainingsessionforstudentsslenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
    static WebDriver driver;
	
    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\senay\\eclipse-workspace\\AutomationSession9th\\trainingsessionforstudentsslenium\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.get("https://www.protrainingtech.com");
    	
    	driver.manage().window().maximize();
    	Thread.sleep(6000);
    	driver.navigate().back();
    	Thread.sleep(6000);
    	driver.navigate().forward();
    	Thread.sleep(6000);
    	String title=driver.getTitle();
    	String curenturl=driver.getCurrentUrl();
    	String session=driver.getWindowHandle();
    	System.out.println(title);
    	System.out.println(curenturl);
    	System.out.println(session);
    	driver.close();
    	
    	
    	
	}

}
