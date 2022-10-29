package utitils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
	
	public void launchApplication(WebDriver driver , String url) {
		driver.get(url);
	}

	/**
	 * clicking on a webelement
	 * 
	 * @param element
	 */
	public void clickOnWebElement(WebElement element) {

		try {
			element.isDisplayed();
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click was not not successful");
		}
	}

	/**
	 * send text to web element
	 * 
	 * @param element
	 * @param text
	 */
	public void sendTextToWebElement(WebElement element, String text) {

		try {
			element.isEnabled();
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click was not not successful");
		}
	}

	/**
	 * clear existing text and send text to web element
	 * 
	 * @param element
	 * @param text
	 */
	public void clearAndSendTextToWebElement(WebElement element, String text) {

		try {
			element.isDisplayed();
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click was not not successful");
		}
	}

	/**
	 * 
	 * @param driver
	 */
	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	/**
	 * 
	 * @param driver
	 */
	public void closeCurrentBrowserWindow(WebDriver driver) {
		driver.close();
	}
	
}
