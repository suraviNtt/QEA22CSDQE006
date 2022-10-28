package utitils;

import org.openqa.selenium.WebElement;

public class CommonMethods {

	public void clickOnWebElement(WebElement element) {
		
		try {
			element.isDisplayed();
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click was not not successful");
		}
	}
	
public void sendTextToWebElement(WebElement element , String text) {
		
		try {
			element.isEnabled();
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Click was not not successful");
		}
	}
}
