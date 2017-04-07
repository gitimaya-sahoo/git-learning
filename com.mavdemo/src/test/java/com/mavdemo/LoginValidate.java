package com.mavdemo;

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginValidate {
	WebDriver driver;

	@BeforeClass
	public void before(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	
	}
	
	@Test
	public void f() throws Exception {
	  driver.get("http://www.amazon.in/");
	  Thread.sleep(3000);
	  
	  String actitle = driver.getTitle();
	  Assert.assertEquals(driver.getTitle(), actitle);
	  System.out.println("Title of the page is : "+actitle);
	}
  
	@AfterClass
	public void afterClass() {
	  driver.quit();
	}

}
