package com.pra.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void testGoogle() throws InterruptedException {
     WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("hyr tutorial",Keys.ENTER);
	String expectedTitle="hyr tutorial - Google Search";
	String actualTitle=driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
    driver.quit();
	}
	
/*	@Test
	public void testFaceBook() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hyr",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();*/
		
		
		
		
		
	}
	

