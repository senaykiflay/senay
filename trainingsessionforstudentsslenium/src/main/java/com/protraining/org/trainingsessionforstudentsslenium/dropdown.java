package com.protraining.org.trainingsessionforstudentsslenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown {
	private static final String WebElement = null;
	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senay\\eclipse-workspace\\AutomationSession9th\\trainingsessionforstudentsslenium\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.get("https://www.facebook.com");
    	
    	driver.manage().window().maximize();
    	
		WebElement CreatbuttonClick = driver.findElement(By.linkText("Create new account"));
		CreatbuttonClick.click();
	//	Thread.sleep(9000);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Create new account")));
		
		WebElement nameFirst = driver.findElement(By.name("firstname"));
		nameFirst.sendKeys("senay");
		//Thread.sleep(6000);
		WebElement familyname = driver.findElement(By.name("lastname"));
		familyname.sendKeys("woldekidan");
		//Thread.sleep(6000);
		WebElement mobileoremail = driver.findElement(By.name("reg_email__"));
		mobileoremail.sendKeys("senay123@gmail");
		//Thread.sleep(6000);
		WebElement password = driver .findElement(By.xpath("//input[@id='password_step_input']/self::input"));
		password.sendKeys("gost");
		
	//	Thread.sleep(6000);
		
		WebElement month= driver.findElement(By.xpath("//select[@id='month']/self::select"));		
		month.click();
		//Thread.sleep(6000);
		WebElement may= driver.findElement(By.xpath("//option[contains(text(),'May')]/self::option"));
		may.click();
		
		//Thread.sleep(6000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']/self::select"));day.click();
		
	//	Thread.sleep(6000);
		WebElement fixedday=driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[2]/option[29]/self::option"));fixedday.click()
;		
		
//Thread.sleep(6000);		
		WebElement year=driver.findElement(By.xpath("//option[contains(text(),'1990')]/self::option"));year.click();
		
		//Thread.sleep(6000);
		
		WebElement female=driver.findElement(By.xpath("//label[contains(text(),'Female')]/self::label"));female.click();
		
		//Thread.sleep(6000);
	//	WebElement signup=driver.findElement(By.Absxpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/button[1]")); sighnup.click();
		
		
		
		
		
	}

}
