package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementLocatorIV {
	
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		
	}
	
	
	@Test
	public void locatortest() {
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ujjwalbachche@gmail.com");
		
		driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("test@123");
		
		driver.findElement(By.partialLinkText("Log ")).click(); 
		
		}
	

	
	@AfterMethod
	
	public void closebrowser() {
		 
		driver.close();
		
		
	}




	
	
	
	
	
	

}
