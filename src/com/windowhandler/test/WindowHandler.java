package com.windowhandler.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandler {

	WebDriver driver;

	@BeforeMethod

	public void launchbrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://magnus.jalaacademy.com/Account/Login");

	}

	@Test()
	public void login() throws InterruptedException {

		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("Popups")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Popup Duplicate")).click();
		
		
	   Set<String> windowId=	driver.getWindowHandles();
	   
	    Iterator<String> it= windowId.iterator();
	    
	    String ParentWindowId=it.next();
	    
	    String ChildWindowId=it.next();
	    
	    
	    driver.switchTo().window(ChildWindowId);
	    
	    System.out.println(driver.getTitle());
	    
	    
	    Thread.sleep(2000);
	    
	    
	    driver.switchTo().window(ParentWindowId);
	    
	    System.out.println(driver.getTitle());
	    
	    
	    
		
		
		
		
		

	}

	@AfterMethod

	public void closebrowser() {

		driver.close();

	}

}
