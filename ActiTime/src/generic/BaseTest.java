package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  class BaseTest implements IAutoConst {

	public WebDriver driver ;
	
	static {
		System.setProperty("webdriver.chrome.driver", CHROME_VALUE);
	}
	
	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(APP_URL);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

	
}
