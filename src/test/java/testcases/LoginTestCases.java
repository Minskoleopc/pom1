package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Login;
import utilities.CommonUtils;

public class LoginTestCases extends TestBase {
	
	static Login login = new Login(driver);
	static CommonUtils utils = new CommonUtils(driver);
	@Test
	public static void validatLoginA() {
		login.ValidLogin();	
		System.out.println(login.userName);
		utils.getElement(login.userName);
		
		
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
