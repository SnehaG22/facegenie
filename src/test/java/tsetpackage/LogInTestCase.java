package tsetpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LogInPage;

public class LogInTestCase extends BaseTest {
	

	@Test
	public void loginUsingValidCred() throws EncryptedDocumentException, IOException, InterruptedException 
	{ 
		LogInPage LP =new LogInPage(driver);
		Flib fil = new Flib();
		LP.validLogIn(fil.readExcelData(Excelpath,"validcredentials",1, 0),fil.readExcelData(Excelpath,"validcredentials", 1, 1));
		String ExpectedUser="testbams@gmail.com";
		String ActualUser = driver.findElement(By.xpath("//p[text()='testbams@gmail.com']")).getText();
		Assert.assertEquals(ActualUser, ExpectedUser, ActualUser);
		
	}
	@Test
	public void loginUsingInvalidCred() throws EncryptedDocumentException, IOException
	{
		LogInPage LP=new LogInPage(driver);
		Flib fil = new Flib();
		int rowcount = fil.rowCount(Excelpath,"invalidcredentials");
		for(int i=1;i<=rowcount;i++)
		{
		   LP.inValidLogin(fil.readExcelData(Excelpath,"invalidcredentials",i,0),fil.readExcelData(Excelpath,"invalidcredentials",i,1));
		
	     }
	}
	@Test
	public void withoitEntringEmailPassClickOnLoinbtn()
	{
		LogInPage LP = new LogInPage(driver);
		LP.getLoginBtn().click();		
	}
	@Test
	public void browserBackOp() throws EncryptedDocumentException, IOException
	{
		LogInPage LP =new LogInPage(driver);
		Flib fil = new Flib();
		LP.validLogIn(fil.readExcelData(Excelpath,"validcredentials",1, 0),fil.readExcelData(Excelpath,"validcredentials", 1, 1));
		driver.navigate().back();
		
	}
}
