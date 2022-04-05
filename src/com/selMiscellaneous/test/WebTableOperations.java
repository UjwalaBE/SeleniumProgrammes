package com.selMiscellaneous.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableOperations {
	
	WebDriver driver;
	
	 
	@BeforeMethod
	
	public void launchbrowser() {
		

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		
	}  
	
	
	
	
	@Test(priority=1)
		
		public void tableRows() {
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		System.out.println("Total number of Rows "+row.size());
		
		
	}
	
	@Test(priority=2)
	   
	public void tableCols() {
		
        List<WebElement> col=driver.findElements(By.xpath("//a[contains(text(),'Vaibhav Global')]/ancestor::tr/child::td"));
		
		System.out.println("Total number of columns "+col.size());
		
		
	}
	
	@Test(priority=3)
	
	 public void getdata() {
		
	String sr=	driver.findElement(By.xpath("//a[contains(text(),'Vaibhav Global')]/ancestor::tr")).getText();
	
	System.out.println(sr);
		
	}
	
	
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
	

	
	
	

}
