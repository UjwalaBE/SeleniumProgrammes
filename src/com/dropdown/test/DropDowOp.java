package com.dropdown.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDowOp {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		
		
		
		
	}  
	
	
	
	
	
	@Test
	public void dropDown() {
		
		
	WebElement ele=	driver.findElement(By.id("mySelect"));
	
	Select sel=new Select(ele);
	
	List<WebElement> tt=sel.getOptions();
	
	
	for(WebElement s:tt) {
		
		System.out.println(s.getText());
		
		
	}
		
		
		
		
	
	
	   		
		 
	}
		
		
	

	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
		
	}

	
	

}