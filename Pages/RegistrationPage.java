package com.projectname1.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.projectname1.qa.Base.TestBase;

public class RegistrationPage extends TestBase {

	// Declaration
		// Object Repository
		
		@FindBy(xpath ="//img[@alt ='Facebook']") private WebElement reg_fblogo;
		@FindBy(xpath ="//a[text() ='Already have an account?']") private WebElement Already_Acc;
		@FindBy(xpath = "//a[text() ='Sign Up']")  private WebElement signuplink;
		@FindBy(name ="firstname") private WebElement FirstName;
		@FindBy(name ="lastname") private WebElement LastName;
		@FindBy(name ="reg_email__") private WebElement MobileNumber;
		@FindBy(name = "reg_passwd__")private WebElement Password;
		@FindBy(name ="birthday_day") private WebElement Birthday;
		@FindBy(name ="birthday_month") private WebElement BirthMonth;
		@FindBy(name ="birthday_year") private WebElement BirthYear;
		@FindBy(xpath ="//label[text() ='Female']") private WebElement GenderFemale;
		@FindBy(xpath ="//label[text() ='Male']") private WebElement GenderMale;
		@FindBy(name ="websubmit") private WebElement SignUpBtn;
		
		// Initialization
		
		public RegistrationPage(WebDriver driver) 
		{
		PageFactory.initElements(driver, this);
		Reporter.log("RegistrationPage",true);
		}
		
		// Usage
		
		public void clickfacbooksignuplink()
		{
		 signuplink.click();
		 Reporter.log("click facbook signup link",true);
		}
		
		public void verifyfacebooklogoinregistrationpage() 
		{
		 Assert.assertTrue(reg_fblogo.isDisplayed(), "Facebook logo is not displayed in Registration page");
		 Reporter.log("verifyfacebooklogoinregistrationpage",true);
		}
		
		public void verifyfacebookregistrationpagealreadyhaveanaccount()
		{
		 Assert.assertTrue(Already_Acc.isDisplayed(), "Already have an account is not displayed");
		 Assert.assertEquals(Already_Acc.getText(), "Already have an account?");
		 Reporter.log("verifyfacebookregistrationpagealreadyhaveanaccount",true);
		}
		
		public void setfirstnameinregistrationpage()
		{
		Assert.assertTrue(FirstName.isEnabled(), "First Name field is not Enabled");
		FirstName.sendKeys("Automation");
		Reporter.log("setfirstnameinregistrationpage",true);
		}
		
		public void setlastnameinregistrationpage()
		{
	     Assert.assertTrue(LastName.isEnabled(), "Last Name field is not enabled ");
	     LastName.sendKeys("Automation@151515151");
	     Reporter.log("setlastnameinregistrationpage",true);
		}
		
		public void setmobilenumberinregistrationpage()
		{
		 Assert.assertTrue(MobileNumber.isEnabled(), "Mobile Number field is not enabled ");
		 MobileNumber.sendKeys("151515151");
		 Reporter.log("setmobilenumberinregistrationpage",true);
		}
		
		public void setpasswordinregistrationpage()
		{
	     Assert.assertTrue(Password.isEnabled(), "Password field is not enabled ");
	     Password.sendKeys("Automation@Maanual");
	     Reporter.log("setpasswordinregistrationpage",true);
		}
		
		public void  setbirthdayinregistrationpage()
		{
		 Select bday = new Select(Birthday);
		 Assert.assertTrue(Birthday.isDisplayed(), "Birth Day is not Displayed in Registration page");
		 Assert.assertTrue(Birthday.isEnabled(),  "Birth Day is not Enabled in Registration page");
		 bday.selectByVisibleText("23");
		 Reporter.log("setbirthdayinregistrationpage",true);
		}
		
		public void setbirthmonthinregistrationpage()
		{
		 Select bmonth = new Select(BirthMonth);
		 Assert.assertTrue(BirthMonth.isDisplayed(), "BirthMonth is not Displayed in Registration page");
		 Assert.assertTrue(BirthMonth.isEnabled(),  "BirthMonth is not Enabled in Registration page");
		 bmonth.selectByVisibleText("Apr");
		 Reporter.log("setbirthmonthinregistrationpage",true);
		}
		
		public void setbirthyearinregistrationpage()
		{
		 Select byear = new Select(BirthYear);
		 Assert.assertTrue(BirthYear.isDisplayed(), "Birth Year is not Displayed in Registration page");
		 Assert.assertTrue(BirthYear.isEnabled(),  "Birth Year is not Enabled in Registration page");
		 byear.selectByVisibleText("1990");
		 Reporter.log("setbirthyearinregistrationpage",true);
		}
		
		public void setgenderinregistrationpage(String gender)
		{
		 if(gender.equalsIgnoreCase("GenderFemale"))
		 {
			 GenderFemale.click();
		 }
		 else
		 {
			 GenderMale.click();
			 Reporter.log("setgenderinregistrationpage",true);
		 }
		}
		public void clickonsignupButton()
		{
		 Assert.assertTrue(SignUpBtn.isDisplayed(), "Sign up Button is Not Displayed");
		 SignUpBtn.click();
		 Reporter.log("clickonsignupButton",true);
		}
		
		

	
	
}
