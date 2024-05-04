package com.protraining.org.trainingsessionforstudentsslenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrope {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senay\\eclipse-workspace\\AutomationSession9th\\trainingsessionforstudentsslenium\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.get("https://www.jqueryui.com");
    	
    	driver.manage().window().maximize();
		
		Thread.sleep(6000);
		WebElement drapable=driver.findElement(By.linkText("Droppable"));
		drapable.click();
		driver.switchTo().frame(0);
		WebElement dragable=driver.findElement(By.id("dragable"));
	
		WebElement dropabletoobjects=driver.findElement(By.id("dropable"));
		Actions ob=new Actions(driver);
		
		ob.dragAndDrop(dragable,dropabletoobjects ).build().perform();
		Thread.sleep(6000);
		driver.switchTo().parentFrame();
		WebElement Resizable=driver.findElement(By.linkText("Resizable"));
		Resizable.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
