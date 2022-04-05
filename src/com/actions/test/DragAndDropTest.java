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
		
		
		
		
	}  
	
	
	
	
	@Test(enabled=false)
		
		public void dragAndDropdevent() throws InterruptedException {
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		WebElement src=driver.findElement(By.xpath("//*[@id='draggable']"));
		
		Thread.sleep(2000);
		
		WebElement dest =driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act=new Actions(driver);                 // Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
		
		act.dragAndDrop(src, dest).pause(2).perform();/// Move the cursor and perform drag and drop action
		
		
		Thread.sleep(2000);
	}
	
	
	@Test()
	
	public void dragAnddrop() throws InterruptedException {
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.cssSelector("div[id='droppable']")))
		.release().build().perform();
		
		
	}
	
	
   
	
	
	
	
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
	

}
