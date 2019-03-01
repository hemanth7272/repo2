package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	final String xp = "(//div[contains(text(),'Settings')])[1]";

	@FindBy(xpath = xp)
	private WebElement settings;

	@FindBy(linkText = "Licenses")
	private WebElement licenses;

	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSettings() {
		settings.click();
		licenses.click();
	}

	public void verifyHomePageisDisplayed(WebDriver driver, long time, String title) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		//WE ARE USING THE EXPLICIT WAIT BECAUSE GETTITLE WILL NOT WORK FOR OTHER TYPES 
		//OF WAIT SINCE THE PAGE HAS TO BE LOADED AND GETTIE SHOULD EXECUTE
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Home page is displayed", true);
//		WE ARE USING TRY CATCH BECAUSE THE TEST CASE MAY FAIL AND THROW THE
			//EXCEPTION AND REST OF THE LINES OF CODE WILL NOT BE3 EXECUTED
		
		}

		catch (Exception e) {
			Reporter.log("Home page is not displayed", true);
			Assert.fail();
		}

	}

}
