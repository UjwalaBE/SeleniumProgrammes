package com.actions.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickandholdTest {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		
	}  
	
	
	
	
	@Test()
		
		public void clickAndhldevent() {
		
		WebElement ele=driver.findElement(By.name("A"));  // Locate the element A by By.xpath. 
		
		Actions act=new Actions(driver);                 // Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
		
		act.moveToElement(ele).clickAndHold().perform();  /// Move the cursor to the position of element A and perform click and hold action
		
		
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
	

}
