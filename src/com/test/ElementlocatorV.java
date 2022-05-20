package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementlocatorV {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("http://magnus.jalaacademy.com");
		
		
	}
	
	
	@Test
	public void locatortest() {
		
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("training@jalaacademy.com");
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("jobprogram");
		
		driver.findElement(By.xpath("//*[contains(@id,'btnLogin')]")).click();
		
		
		}
	

	
	@AfterMethod
	
	public void closebrowser() {
		 
		driver.close();
		
		
	}




	
	
	
	
	
	
	
	
	

}
