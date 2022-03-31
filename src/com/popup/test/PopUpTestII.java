package com.popup.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpTestII {
	
	
	

	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
	  	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		
	}  
	
	
	
	
	@Test
	public void popup() {
		
		
		driver.findElement(By.name("confirmalertbox")).click();
		
		
	Alert aler= driver.switchTo().alert();
	
	
	
	aler.accept();
	
	//aler.dismiss();
		

		
		
		}


	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
		
	}
	
	
	
	

}
