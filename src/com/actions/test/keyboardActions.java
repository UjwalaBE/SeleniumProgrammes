package com.actions.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class keyboardActions {
	
	
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		
	}  
	
	
	
	
	@Test(priority=1)
	
	public void keyboardActionTest() {
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}
	
	
	@Test(priority=2)
	
	   void tabPressAction() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("ujjwal");
		
		Actions at=new Actions(driver);
		at.sendKeys(Keys.TAB)
		.sendKeys("bachche")
		.sendKeys(Keys.TAB)
		.sendKeys("123456789")
		.sendKeys(Keys.TAB)
		.sendKeys("11445522")
		.build().perform();
		
		
		
		

		
	
	}
	
	@AfterMethod
	
	public void closebrowser() {
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
