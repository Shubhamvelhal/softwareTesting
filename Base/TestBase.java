package com.projectname1.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Parameters;

public class TestBase {
	
	public static WebDriver driver;
	
	
//	@Parameters("browser")	
	public void Initialisebrowser(String browser)
	 {
	  if(browser.equalsIgnoreCase("chrome")) 
	 {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\Automation Files\\Browser path\\chromedriver.exe");
	  driver = new ChromeDriver();
	 }
	  else if (browser.equalsIgnoreCase("firefox"))
	 {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\shubham\\Downloads\\Automation Files\\Browser path\\geckodriver.exe" );
	  driver = new FirefoxDriver();
	 }
	  else
	 {
	  System.out.println("The Wrong Browser is Selected by the User");
	  }
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
     

}
