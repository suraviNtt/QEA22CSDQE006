package testcases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserSetup.BrowserSetup;
import reader.PropertiesReader;
import utitils.CommonMethods;

public class SwitchingWindowsTest {

	public static void main(String[] args) {

		PropertiesReader propertiesReader = new PropertiesReader();
		CommonMethods commonMethods = new CommonMethods();
		WebDriverWait wait = null;

		String url = "https://www.amazon.in/s?k=mobile+smartphones+under+30000&crid=1D5LN8R0X2KL0&sprefix=%2Caps%2C191&ref=nb_sb_ss_recent_1_0_recent";
		// xpaths
		String firstSearchResultXpath = "(//span[@data-component-type='s-search-results']//a//img)[1]";

		WebDriver driver = BrowserSetup.getDriver(propertiesReader.getBrowserName(),
				propertiesReader.getImplicitWait());
		wait = new WebDriverWait(driver, Duration.ofSeconds(propertiesReader.getExplicitWait()));

		commonMethods.launchApplication(driver, url);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstSearchResultXpath)));
		WebElement firstSearchResult = driver.findElement(By.xpath(firstSearchResultXpath));
		commonMethods.clickOnWebElement(firstSearchResult);

		String parentPage = driver.getWindowHandle();
		Set<String> windowsOpen = driver.getWindowHandles();
		for (String window : windowsOpen) {
			if (window != parentPage) {
				driver.switchTo().window(window);
			}
		}

		WebElement productTitle = driver.findElement(By.id("productTitle"));
		System.out.println("Product titel : " + productTitle.getText());

		commonMethods.closeCurrentBrowserWindow(driver);
		driver.switchTo().window(parentPage);
		System.out.println("Parent window title : " + driver.getTitle());

		commonMethods.closeCurrentBrowserWindow(driver);

	}
}
