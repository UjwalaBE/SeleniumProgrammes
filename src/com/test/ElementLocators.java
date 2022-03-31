package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementLocators {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		
	}//9561620202  
	//“http://dl.bintray.com/testng-team/testng-eclipse-release/
	
	
	
	
	@Test
	public void locatortest() {
		
		driver.findElement(By.name("email")).sendKeys("ujjwal@gmil.com");
		
		driver.findElement(By.name("pass")).sendKeys("test@123");
		
		driver.findElement(By.name("login")).click();
		
		
		}
	

	
	@AfterMethod
	
	public void closebrowser() {
		
		driver.close();
		
		
	}

}
