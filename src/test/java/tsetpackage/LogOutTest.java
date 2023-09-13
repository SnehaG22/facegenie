package tsetpackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import pagepackage.LogOut;

public class LogOutTest extends BaseTest{
	@BeforeMethod
	public void LogIN() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LogInTestCase login = new LogInTestCase();
		login.loginUsingValidCred();
	}
	@Test
	public void Logout() throws InterruptedException
	{
		LogOut logout = new LogOut(driver);
	     logout.Logout();
	}
	

}
