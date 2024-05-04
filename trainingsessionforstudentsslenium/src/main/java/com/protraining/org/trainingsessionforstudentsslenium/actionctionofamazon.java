package com.protraining.org.trainingsessionforstudentsslenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionctionofamazon {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senay\\eclipse-workspace\\AutomationSession9th\\trainingsessionforstudentsslenium\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.get("https://www.lexus.com");
    	
    	driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
	WebElement shoplinks = driver. findElement(By.xpath("//*[text()='shop' and @aria-expanded='false' ]"));
		
	Actions ob=new Actions(driver);	
		
	ob.moveToElement(shoplinks).build().perform();
	Thread.sleep(6000);	
		WebElement search=driver.findElement(By.xpath("//a[aria-lael=\"SEARCH L/CERTIFIED\"]"));
		ob.moveToElement(search).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
