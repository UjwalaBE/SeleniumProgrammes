package com.textboxop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementOp {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		
	}
	 //1] typing in text box by using  sendKeys
	
	@Test
	public void locatortest() {
		
		driver.findElement(By.id("email")).sendKeys("ujjwal@gmil.com"); // 
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("test@123");
		
		driver.findElement(By.linkText("Log In")).click();
		
		}
	
	
	 //2] typing in text box by using javaScriptExecutor
	
	
	
	@Test
	
	public void webElementTest() {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('email').value='ujjwal@gmail.com'");
		
	}

	
	@AfterMethod
	
	public void closebrowser() {
		 
		driver.close();
		
		
	}

	
	
	
	
	
	

}
