package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashBoardPage {
	@FindBy(id="demo-simple-select-helper")private WebElement dropdown;
	@FindBy(xpath = "//li[text()='1']")private WebElement value;
	@FindBy(xpath = "//button[text()='Sync Todays Attendance']")private WebElement TodaysAttendanceBtb;
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getGropDown() 
	{
		return dropdown;
	}
	public WebElement getValue() 
	{
		return value;
	}
	public WebElement getTodaysAttendancebtn() 
	{
		return TodaysAttendanceBtb;
	}
	
	public void selectBus()
	{
		dropdown.click();
		value.click();
	}
	public void todaysAttendance()
	{
		TodaysAttendanceBtb.click();
	}

}
