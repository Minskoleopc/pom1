package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;

public class Login  extends TestBase{
	
	public Login(WebDriver driver) {
		TestBase.driver = driver;
	}
	
	// Locators
	public By userName = By.cssSelector("#user-name");
	By password = By.cssSelector("#password");
	By loginButton = By.cssSelector("#login-button");
	By logo = By.cssSelector(".login_logo");
	By errorMsg =  By.cssSelector("h3");
	
	

	// Login 
	public void ValidLogin() {
		driver.findElement(userName).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(loginButton).click();	
		
	}
	
	// InvalidLogin 
	
	public Boolean InvalidLogin() {
		driver.findElement(userName).sendKeys("standard_er");
		driver.findElement(password).sendKeys("secret_sau");
		driver.findElement(loginButton).click();
		return driver.findElement(errorMsg).isDisplayed();
	}
	
	
	// Validate title
	public String validateTitle() {
		return driver.getTitle();
	}
	
	// LogoPresent
	
	public Boolean LogoVisible() {
		return driver.findElement(logo).isDisplayed();
	}
	
	

	
	

}
