package com.selMiscellaneous.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumWaits {
	
	
	WebDriver driver;
	
	 
	@Test()
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);  //dynamic wait, wait until page is fully loaded
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// global wait  applicable for all the webelement
		
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
        
        
        WebDriverWait wait=new WebDriverWait(driver,20);
        
        WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo']")));
        
        
          
	    if(ele.isDisplayed()) {
	    	
	    	System.out.println("element is displayed");
	    	
	    }
	    else {
	    	
	    	System.out.println("element is not displayed");
	    }
	    	
	    
	    
       
        
	    
	    
	    
	   
	    
	    
	    
		
		
		
		
	
	
	
	}
	
	
	
	
	

}
