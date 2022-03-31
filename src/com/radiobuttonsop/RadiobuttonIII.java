package com.radiobuttonsop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadiobuttonIII {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/radio-button");
		
		
	}  
	//“http://dl.bintray.com/testng-team/testng-eclipse-release/
	
	
	
	
	@Test
	public void radioOp() throws InterruptedException {
		
		WebElement d=	driver.findElement(By.xpath("//label[contains(text(),'Impressive')]"));
		
		d.click();
		
		Thread.sleep(2000);
		
	
	
	   System.out.println(d.getText());
		
		 
		
		
		}
	

	
	@AfterMethod
	
	public void closebrowser() {
		
		driver.close();
		
		
	}

}

	
	


