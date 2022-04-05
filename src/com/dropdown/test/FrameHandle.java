package com.dropdown.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandle {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().deleteAllCookies();
		
		driver.get("http://magnus.jalaacademy.com/");
	}
	
	
   @Test()
	
	public void windowhandle() throws InterruptedException {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		
	    driver.findElement(By.name("Password")).sendKeys("jobprogram");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
        Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("More")).click();
	  
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("iFrames")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.switchTo().frame("iframe1");
	    
	    driver.findElement(By.className("navbar-toggler-icon")).click();
	    
	    Thread.sleep(2000);
	    
	    WebElement ele =   driver.findElement(By.id("navbarDropdown"));
	    
	  // driver.findElement(By.linkText("History")).click();      //not working with Select and Actions class
	   
	  // Select sel=new Select(ele);
	   
	  // sel.selectByVisibleText("History");
	   
	    
	    ele.click();
	    
	    
	    driver.findElement(By.linkText("History")).click();
	    
	    
     }
   
   
   @AfterMethod
   
   public void tearDown() {
	   
	   //driver.quit();
   }
   
   
	
	
	
	
	
	

}
