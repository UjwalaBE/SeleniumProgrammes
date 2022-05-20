package com.radiobuttonsop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadiobuttonSel {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("http://magnus.jalaacademy.com/Account/Login");
		
		
	}  
	
	
	
	
	
	@Test
	public void radioOp() throws InterruptedException {
		

		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("CSS Properties")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Buttons")).click();
		
		
		
		
		
		
		
		
		Boolean d= driver.findElement(By.xpath("//div[@id='tab_3']//button[@class='btn btn-primary']")).isEnabled();
		
	
		
		Thread.sleep(2000);
		
	
	
	   System.out.println(d);
		
		 
		
		
		}
	

	
	@AfterMethod
	
	public void closebrowser() {
		
		driver.close();
		
		
	}

	
	
	
	

}
