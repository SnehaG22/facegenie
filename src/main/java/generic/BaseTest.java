package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Flib implements IoConstant {
	protected static WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib fil = new Flib();
		String url = fil.readPropertyData(PropertyPath,"URL");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}

}
