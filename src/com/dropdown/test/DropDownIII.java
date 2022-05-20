package com.dropdown.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownIII {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		 driver.get("http://magnus.jalaacademy.com/Account/Login");
		

		
		
		
	}  
	          
	
	
	
	@Test
	public void radioOp() throws InterruptedException {
		
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("More")).click();
		  
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("Menu")).click();
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.linkText("Sub Menus")).click();
	    
	    Thread.sleep(1000);
	  
	    WebElement ele=  driver.findElement(By.linkText("Testing"));
	    
	    Select sel= new Select(ele);
	    
	    sel.selectByVisibleText("Selenium");
	    
	    
		
		
		
		}
	

	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
		
	}
	
	
	
	

}
