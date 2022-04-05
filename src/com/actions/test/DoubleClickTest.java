package com.actions.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoubleClickTest {
	
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/buttons");
		
		
	}  
	
	
	
	
	@Test()
		
		public void doubleClickEvent() {
		
		WebElement ele=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act=new Actions(driver);                 
		
		act.doubleClick(ele).perform();
		
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
	

	
	

}
