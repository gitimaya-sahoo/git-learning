package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import BusinessComponent.BC_EditInfo;
import BusinessComponent.BC_Login;
import Framework.Browsers;
import Framework.ReadWriteExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RunTest {
  
  public static void main(String[] args) throws Exception {
	 
	  //Object Repository***********************
	  File src = new File("Config.property");
	  FileInputStream fis = new FileInputStream(src);
	  Properties pro = new Properties();
	  pro.load(fis);
	  String url1 = pro.getProperty("URL");
	  		//System.out.println("url is : "+url1);
	  String un1 = pro.getProperty("user1");
	  String pw1 = pro.getProperty("pwd1");
	  //Object Repository***********************
	  System.out.println("For GIT n jenkins..");
	  
	  //Select Specific Browser
	  Browsers.selectBrowser("chrome");
	  BC_Login.buslogin(url1, un1, pw1);
	  
	  
	  BC_EditInfo.editinfo("GT8");
	  WebDriver driver = Browsers.callDriver();
	  driver.close();
	  
  }

  
}
