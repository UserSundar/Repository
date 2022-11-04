package com.pra.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmTest {
	
	WebDriver driver;
	@Test(priority=1)
	public void LaunchApp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void EnterLoginDetails() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void NavigateToMyInfo() throws InterruptedException {
  driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();;
  Thread.sleep(2000);
	}
/*	@Test(priority=4)
	public void VerifyMyInfo() {
		System.out.println(driver.findElement(By.className("oxd-table-filter")).isDisplayed());
      driver.quit();		
	}*/
	
	@Test
	public void VerifyLoginInfo() {
		System.out.println(driver.getTitle());
	}
	

}
