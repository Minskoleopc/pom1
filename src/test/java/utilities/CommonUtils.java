package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class CommonUtils extends TestBase {

	public CommonUtils(WebDriver driver) {
		TestBase.driver = driver;
	}

	// getPageTitle()
	public String getPageTitle() {
		try {
			System.out.println("The title f page is " + driver.getTitle());
			return driver.getTitle();
		} catch (Exception e) {
			throw new Error("title not found");
		}
	}

	// getElement

	public WebElement getElement(By selector) {
		try {
			return driver.findElement(selector);
		} catch (Exception NoSuchElementException) {
			throw new Error(" element not founds");
			// return null;
		}

	}

	// sendKeys
	public void SendKeys(String text, By selector) {

		try {
			clearText(selector);
			getElement(selector).sendKeys(text);
			;
		} catch (Exception NoSuchElementException) {
			throw new Error(" element not founds");
		}

	}

	// clear text()

	public void clearText(By selector) {

		try {
			getElement(selector).clear();
			;
			;
		} catch (Exception NoSuchElementException) {
			throw new Error(" element not founds");
		}

	}

	// wait for element to be visible

	public void waitForElementVisible(By selector, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(selector));

	}

	// element to be clickable

	public void waitForElementToBeClickable(By selector, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(selector));

	}

	// window Handle

	public static void switchToWindow(WebDriver driver, String windowHandle) {
		driver.switchTo().window(windowHandle);
	}
	
	
	// scrollIntoView
	
	public static void scrollIntoView(WebDriver driver , By selector) {
		WebElement e = driver.findElement(selector);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "arguments[0].scrollIntoView();";
		js.executeScript(script, e);
		
	}
	
	// waitforPagetoload
	
	public static void waitForPagetoLoad(WebDriver driver, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'completed';"));
		
	}
	
	public static void takeScreenShot(WebDriver driver , String filepath) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(filepath);
		FileUtils.copyFile(src, des);
		
	}
	
	// To switch to the iframe using name or id
	// how can we manage 3 in one utility
	
	public static void switchToIframe(WebDriver driver , String idValue) {
		driver.switchTo().frame(idValue);	
	}
	
	// Drop down  --- select tagName
	
	// how can we manage 3 in one utility
	
	public static void selectByText(WebDriver driver , By selector , String text ) {
		Select ss = new Select(driver.findElement(selector));
		ss.selectByVisibleText(text);
	}
	
	

}
