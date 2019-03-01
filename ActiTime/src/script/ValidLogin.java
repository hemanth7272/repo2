package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	@Test(priority = 1)
	public void testValidLogin() {
		String un = XL.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw = XL.getData(XL_PATH, "ValidLogin", 1, 1);
		String title = XL.getData(XL_PATH, "ValidLogin", 1, 2);
		// Enter valisd username
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		// Enter valid password
		l.setPassword(pw);
		// click on the login button
		l.clickLogin();

		// verify the home page is displayed
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.verifyHomePageisDisplayed(driver, ETO, title);

	}

}
