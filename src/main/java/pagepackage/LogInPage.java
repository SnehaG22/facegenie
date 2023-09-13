package pagepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
	@FindBy(id ="email")private WebElement EmailTextFeild;
	@FindBy(id="password")private WebElement PassTextFeild;
	@FindBy(xpath ="//button[@type='submit']")private WebElement Loginbtn;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmailtextFeild() 
	{
		return EmailTextFeild;
	}
	public WebElement getPassTextFeild() 
	{
		return PassTextFeild;
	}
	public WebElement getLoginBtn() 
	{
		return Loginbtn;
	}
	public void validLogIn(String ValidEmail, String ValidPass) 
	{
		EmailTextFeild.sendKeys(ValidEmail);
		PassTextFeild.sendKeys(ValidPass);
		
		Loginbtn.click();
	}
	public void inValidLogin(String Email, String Pass)
	{
		getEmailtextFeild().sendKeys(Email);
		getPassTextFeild().sendKeys(Pass);
	    getLoginBtn().click();
	    EmailTextFeild.clear();
	    PassTextFeild.clear();
	}

}
