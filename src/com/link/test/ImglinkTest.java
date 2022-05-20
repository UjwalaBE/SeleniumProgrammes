package com.link.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImglinkTest {

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

	@Test
	public void linktestest() throws InterruptedException {

		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.name("Password")).sendKeys("jobprogram");

		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("More")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Links")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Image Links")).click();

		WebElement img = driver.findElement(By.xpath("//div[@id='tab_3']//a[@href='http://jalatechnologies.com/']"));
		
		img.click();

		System.out.println(img.getAttribute("href"));

	}

	@AfterMethod

	public void closebrowser() {

		// driver.close();

	}

}
