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
		
		driver.get("http://magnus.jalaacademy.com/Account/Login");
		
		
	}  
	
	
	
	
	
	
	@Test()
	
	   void tabPressAction() throws InterruptedException {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		
		Actions at=new Actions(driver);
		at.sendKeys(Keys.TAB)
		.sendKeys("jobprogram")
		
	
		.build().perform();
		
		
		
		

		
	
	}
	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
