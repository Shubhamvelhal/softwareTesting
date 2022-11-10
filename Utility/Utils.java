package com.projectname1.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.projectname1.qa.Base.TestBase;

public class Utils extends TestBase {

// ============================================ ScreenShot Utility ==================================================
	
    public static void getscreenshot(WebDriver driver) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   // capture the screenshot for you keep in selenium memory
	Date d = new Date();
	System.out.println(d);
	String filename = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
	File dest = new File ("C:\\Users\\shubham\\eclipse-workspace\\com.projectname1.qa\\ScreenShots_"+filename);
	FileUtils.copyFile(src, dest);
	}

//============================================ Apache Poi Excel Sheet Utility ==================================================  
  
  public static void main(String[] args) throws EncryptedDocumentException, IOException
   {
	FileInputStream file = new FileInputStream("C:\\Users\\shubham\\eclipse-workspace\\com.projectname1.qa\\src\\main\\java\\com\\projectname1\\qa\\TestData\\Automation.xlsx");
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
    }
	
//============================================ Java Script Executor ==================================================  
  	
	// 1. Create The Border
	
		public static void borderbyJs(WebDriver driver, WebElement element)
		{
		 JavascriptExecutor  js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].style.border = '3px solid red'", element);
	    }
		
		  //2.Capture the title of the webpage
		
		public static String titlebyJs(WebDriver driver) 
		{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	  	String Title = js.executeScript("return document.title;").toString();	
		return Title;
		}
		
		//3.Click on particular Element
		
		public static void clickbyJs(WebDriver driver, WebElement element) 
		{
		JavascriptExecutor   js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	    }
		
		// 4. Generating an Alert
		
		public static void alertbyJs(WebDriver driver,String message)
		{
			JavascriptExecutor  js = ((JavascriptExecutor)driver);
			js.executeScript("alert('"+ message +"')");   // alert('"+ space Message space +'")");
		}
		
		//5.Refreshing the page
		
		public static void refershbyJs(WebDriver driver)
		{
		 JavascriptExecutor   js = ((JavascriptExecutor)driver);
		 js.executeScript("history.go(0)");
		}
		
		//6. Scrolling the WebPage 
		
		// Scrolling Down
		
		  public static void scrolldownbyJs(WebDriver driver,int x,int y)
		{
	     JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("scroll("+ x +","+ y +")");
		}
		  
	     // Scrolling up
		  
		  public static void scrollupbyJs(WebDriver driver,int x,int y)
		{
	     JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("scroll("+ x +","+ y +")");
		}
		  
		  // Scroll into view
		  
		  public static void scrollintoviewby(WebDriver driver, WebElement element) 
		  {
		   JavascriptExecutor js = ((JavascriptExecutor)driver);
		   js.executeScript("arguments[0].scrollintoview",element);
		  }
		  


}
