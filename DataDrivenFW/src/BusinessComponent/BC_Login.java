package BusinessComponent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Framework.Browsers;
import PageObjects.PO_Login;

public class BC_Login {

	static WebDriver driver = Browsers.callDriver();
	
	//Below function for opening URL
	public static void buslogin(String URL,String un, String pw){
	
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		PO_Login.typeuser(un);
		PO_Login.typepwd(pw);
		PO_Login.clickbtn();
	}
}
