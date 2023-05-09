package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class CommonUtils  extends TestBase{
	
	
	public CommonUtils(WebDriver driver) {
		TestBase.driver = driver;
	}
	
	// getPageTitle()
	
	public String getPageTitle() {
		try {
			System.out.println("The title f page is "+ driver.getTitle());
			return driver.getTitle();
		}
		catch(Exception e){
			throw new Error("title not found");
		}
	}
	
	// getElement 
	
	public WebElement getElement(By selector) {
		
		try {
			return driver.findElement(selector);
		}
		catch(Exception NoSuchElementException) {
			throw new Error(" element not founds");
			//return null;
		}
	
	}
	
	// sendKeys
	public void SendKeys(String text ,By selector ) {
		
		try {
			clearText(selector);
			getElement(selector).sendKeys(text);	;
		}
		catch(Exception NoSuchElementException) {
			throw new Error(" element not founds");
		}

	}
	
	// 
	
	public void clearText(By selector ) {
		
		try {
			getElement(selector).clear();;	;
		}
		catch(Exception NoSuchElementException) {
			throw new Error(" element not founds");
		}

	}
	
	
	// switch to Alert()
	
	
	// switch to Iframe()
	
	
	// wait()
	
	
	// fluent wait()
	
	
	// maximum()
	
	
	// findElements 
	
	
	// isDisplayed()
	
	
	// isSelected()
	
	
	// isEndabled()
	
	
	// Drop Down()
	
	
	// radioButton()
	
	
	// windowHandles()
	
	
	// screenShot()
	
	
	// Actions
	
	
	// Click()
	
	
	// Navigate to pages()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
