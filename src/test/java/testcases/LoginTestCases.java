package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Login;

public class LoginTestCases extends TestBase {
	
	static Login login = new Login(driver);
	@Test
	public static void validatLoginA() {
		login.ValidLogin();	
	}

	@Test
	public static void validateLogo() {
		Boolean actualValuea = login.LogoVisible();
		Assert.assertTrue(actualValuea);
	}
	@Test
	public static void validateTitle() {
		String text = login.validateTitle();
		Assert.assertEquals(text, "Swag Labs");
	}

}
