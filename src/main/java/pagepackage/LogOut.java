package pagepackage;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BaseTest;

public class LogOut extends BaseTest {
	@FindBy(xpath ="//span[text()='Log Out']")private WebElement LogOutBtn;
	@FindBy(xpath = "//button[text()='Ok']")private WebElement OkBtn;
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogOutBtn()
	{
		return LogOutBtn;
	}
	public WebElement getOkBtn()
	{
		return OkBtn;
	}
	public void Logout() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(getLogOutBtn()));
		LogOutBtn.click();
		OkBtn.click();
		
	}
	

}
