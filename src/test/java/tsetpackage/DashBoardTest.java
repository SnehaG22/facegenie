package tsetpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import pagepackage.DashBoardPage;

public class DashBoardTest extends BaseTest{
	@BeforeMethod
	public void LogIN() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LogInTestCase login = new LogInTestCase();
		login.loginUsingValidCred();
		Thread.sleep(10000);
	}
	@Test
	public void validatingDropdown()
	{
		DashBoardPage DP = new DashBoardPage(driver);
		DP.selectBus();
	}
	@Test
	public void validatingTodaysAttendanceFunc()
	{
		DashBoardPage DP = new DashBoardPage(driver);
		DP.todaysAttendance();
	}

}
