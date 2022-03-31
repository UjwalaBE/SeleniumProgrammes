package com.link.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImglinkTest {
	
	
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
	  	driver.get("https://developers.google.com/speed/webp/gallery");
		
		
	}  
	
	
	
	
	@Test
	public void linktestest() {
		
		
	WebElement img=	driver.findElement(By.xpath("//img[@src='https://www.gstatic.com/webp/gallery3/1.sm.png']"));
	
	img.click();
	
	System.out.println(img.getAttribute("src"));
			 
		

		
		
		}


	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
		
	}
	
	
	
	
	
	

}
