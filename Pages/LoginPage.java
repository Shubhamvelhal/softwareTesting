package com.projectname1.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


import com.projectname1.qa.Base.TestBase;

public class LoginPage extends TestBase {
	
	//Declaration
		//Object Repositary
		
		@FindBy(xpath = "//img[@class='fb_logo _8ilh img']") private WebElement Fblogo_loginpage;
		@FindBy(xpath = "//h2[text() ='Facebook helps you connect and share with the people in your life.']") private WebElement FbMessageloginpage;
		@FindBy(xpath = "//a[@data-testid='open-registration-form-button']") private WebElement FbCreatenewAccount;
		@FindBy(xpath = "//a[text()= 'Create a Page']") private WebElement Fbcraetepage;
		@FindBy(xpath = "//a[text()= 'Forgotten password?']") private WebElement Fbforgottenpassword;
		@FindBy(name = "email") private WebElement FbEmailorMobile;
		@FindBy(name = "pass") private WebElement FbPassword;
		@FindBy(name = "login") private WebElement FbLoginButton;
		@FindBys({@FindBy(xpath = "//ul[contains(@class,'uiList pageFooterLinkList')]/li/a")}) private List<WebElement> FbFooterlinks;

		// Initialisation
	
		public LoginPage(WebDriver driver)
		{
		 PageFactory.initElements(driver, this);
		}
		
		//Usage
		
		public void VerifyTheFacebookLogoinLoginPage()
		{
		 Assert.assertTrue(Fblogo_loginpage.isDisplayed(),"The Logo is not Diplayed in Login Page");
		 Reporter.log("VerifyTheFacebookLogoinLoginPage");
		}
		
		public void VerifytheFacebookMessagefromLoginPage()
		{
		 Assert.assertTrue(FbMessageloginpage.isDisplayed(), "The Message is not Diplayed in Login Page");	
		 Assert.assertEquals(FbMessageloginpage.getText(), "Facebook helps you connect and share with the people in your life.");
		 Reporter.log("VerifytheFacebookMessagefromLoginPaage",true);
		 System.out.println(FbMessageloginpage.getText());
		}
		
		public void VerifyFacebookCreateNewAccountButton()
		{
		 Assert.assertTrue(FbCreatenewAccount.isDisplayed(), "The Create new account Button is not Diplayed in Login Page");	
		 Reporter.log("VerifyFacebookCreateNewAccountButton");
		}
		
		public void  VerifyFacebookCreatePageforCelebrityButton()
		{
		 Assert.assertTrue(Fbcraetepage.isDisplayed(), "The Create new page is not Diplayed in Login Page");	
		 Assert.assertEquals(Fbcraetepage.getText(), "Create a Page");
		 Reporter.log("VerifyFacebookCreatePageforCelebrityButton");	
		}
		
		public void  VerifyFacebookForgottenPasswordlink()
		{
		 Assert.assertTrue(	Fbforgottenpassword.isDisplayed(), "The Forgotten Password link is not Diplayed in Login Page");	
		 Reporter.log("VerifyFacebookForgottenPasswordlink");	
		}
		
		public void setUsernameinUsernameField()
		{
		 Assert.assertTrue(FbEmailorMobile.isEnabled(), "The username Field is Not Enabled");
		 FbEmailorMobile.sendKeys("Automation");
		 Reporter.log("setUsernameinUsernameField");		
		}
		
		public void setPasswordinPasswordField()
		{
		 Assert.assertTrue(FbPassword.isEnabled(), "The Password Field is Not Enabled");
		 FbPassword.sendKeys("Manual@62226");
		 Reporter.log("setUsernameinUsernameField");		
		}
		
		public void ClickOnLoginButton()
		{
		 Assert.assertTrue(FbLoginButton.isDisplayed(),"The Login Button is Not Displayed in login Page");
		 FbLoginButton.click();
		 Reporter.log("ClickOnLoginButton");	
		}
		
		public void verifyfooterlinks()
		{
		 Assert.assertEquals(FbFooterlinks.size(), 31);	
		 Reporter.log("ClickOnLoginButton");	
		}
		
		
		
		

}
