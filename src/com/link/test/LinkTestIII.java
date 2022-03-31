package com.link.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkTestIII {

	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://testlink.org/");
		
		
	}  
	
	
	
	
	@Test
	public void linktestt() {
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//int a=links.size();
		
		//System.out.println(a);
		
		//for(int i=0;i<=links.size();i++) {
			
			for(WebElement linkss:links) {
				
				System.out.println(linkss.getText());
			}
			
			
			 
		
		
		
		
		
		
		
		}
	

	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
