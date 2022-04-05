   package com.selMiscellaneous.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxControlTest {
	
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.in/");
		
		
	}  
	
	
	
	@Test()
		
		public void ajaxAutoSuggest() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		String str=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/ul[1]")).getText();
		
		System.out.println(str);
		
		
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
	

	

}
