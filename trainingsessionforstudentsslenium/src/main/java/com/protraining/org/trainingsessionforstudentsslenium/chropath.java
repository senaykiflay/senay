package com.protraining.org.trainingsessionforstudentsslenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class chropath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senay\\eclipse-workspace\\AutomationSession9th\\trainingsessionforstudentsslenium\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.get("https://money.rediff.com/index.html");
    	
    	driver.manage().window().maximize();
		Thread.sleep(6000);
		
		String text=driver.findElement(By.xpath("//a[contains(text(),'NIFTY BANK')]/self::a")).getText();
		System.out.println("text");
		
		
		
		
		
		
		
		
		

	}

}
