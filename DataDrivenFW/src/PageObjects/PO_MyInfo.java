package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Framework.Browsers;

public class PO_MyInfo {
	
	private static By myinfo = By.id("menu_pim_viewMyDetails");
	private static By btnedit = By.id("btnSave");
	private static By nickname = By.name("personal[txtEmpNickName]");
	private static By military = By.name("personal[txtMilitarySer]");
	private static By otherID = By.name("personal[txtOtherID]");
	private static By btnsave = By.id("btnSave");

	
	public static WebDriver driver=Browsers.callDriver();
	
	public static void info(){
		driver.findElement(myinfo).click();
	}
	
	public static void clickedit(){
		driver.findElement(btnedit).click();
	}
	public static void enternickname(String name){
		driver.findElement(nickname).clear();
		driver.findElement(nickname).sendKeys(name);;
	}
	public static void entermilitary(String milit){
		driver.findElement(military).clear();
		driver.findElement(military).sendKeys(milit);
		
	}
	public static String getotherid(){
		String oid = driver.findElement(otherID).getText();
		return oid;
	}
	public static void clicksave(){
		driver.findElement(btnsave).click();
	}
	

}
