package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static WebDriver driver;
	
	public static WebDriver callDriver(){
		return driver;
		}
		
	public static void selectBrowser(String browser){
		if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver","D://SelzSupport//geckodriver-v0.14.0-win64//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","D://SelzSupport//chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","D://SelzSupport//IEDriverServer_x64_3.2.0//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}
}
