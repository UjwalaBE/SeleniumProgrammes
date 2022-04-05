package com.selMiscellaneous.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

public class CaptureScreenshot {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("http://magnus.jalaacademy.com/");
		
		
	}  
	
	
	
	
	@Test
	public void captureScreen() throws IOException, InterruptedException {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		
	    driver.findElement(By.name("Password")).sendKeys("jobprogram");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
	    Thread.sleep(2000);
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    
	    File file= ts.getScreenshotAs(OutputType.FILE);
	    
	    FileUtils.copyFile(file,new File("C:\\Users\\DELL\\eclipse-workspace\\java-Selenium\\SeleniumPrograming\\screenshot\\image.png"));
		
	}
		
	

	
	@AfterMethod
	
	public void closebrowser() {
		
		//driver.close();
		
		
	}
	
	
	
	
	
	
	

}
