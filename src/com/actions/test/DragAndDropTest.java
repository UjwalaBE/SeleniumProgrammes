


package com.actions.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest {
	
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("http://magnus.jalaacademy.com/Account/Login");
		
		
		
		
	}  
	
	
	
	
	
	
	@Test()
	
	public void dragAnddrop() throws InterruptedException {
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(1000);

		WebElement w1=driver.findElement(By.xpath("//div[@id='blue']/child::div[1]/descendant::div[1]"));
		
		WebElement w2=driver.findElement(By.xpath("//div[@id='blue']/child::div[1]/descendant::div[4]"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.clickAndHold(w1).moveToElement(w2)
		
		.release().build().perform();
		
		
	}
	
	
   
	
	
	
	
	
	
	@AfterMethod
	
	public void tearDown() {
		
		//driver.quit();
	}
	

}
