package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Framework.Browsers;

public class PO_Login {

	private static By txtuser = By.name("txtUsername");
	private static By txtpwd = By.name("txtPassword");
	private static By btnSubmit = By.name("Submit");
	
	//@FindBy(name="Submit")
	//@CacheLookup
	//private static WebElement btnSubmit;
	
	public static WebDriver driver=Browsers.callDriver();
	
	public static void typeuser(String uname){
		driver.findElement(txtuser).sendKeys(uname);
	}
	
	public static void typepwd(String pwd){
		driver.findElement(txtpwd).sendKeys(pwd);
	}
	
	public static void clickbtn(){
		driver.findElement(btnSubmit).click();
	}
	
}
