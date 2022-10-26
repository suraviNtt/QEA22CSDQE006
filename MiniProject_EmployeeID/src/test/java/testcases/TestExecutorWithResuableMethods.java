package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import browserSetup.BrowserSetup;
import browserSetup.CommonMethods;

public class TestExecutorWithResuableMethods {

	
	public static void main(String[] args) throws InterruptedException {

		String browsername = "edge";
		String url = "https://www.google.com/";
		String searchText = "Selenium";
		String firstSearchResultXpath = "(//div[@id='rso']//a)[1]";
		
		BrowserSetup browserSetup = new BrowserSetup();
		CommonMethods commonMethods = new CommonMethods();
		WebDriver driver = browserSetup.getDriver(browsername);
		driver.get(url);

		WebElement searchBox = driver.findElement(By.name("q"));
		try {
		searchBox.sendKeys(searchText);
		searchBox.sendKeys(Keys.ENTER);
		}catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(2000);
		WebElement firstSearchResult = driver.findElement(By.xpath(firstSearchResultXpath));
		commonMethods.clickOnWebElement(firstSearchResult);

		String seleniumPageActualTitle = driver.getTitle();
		String seleniumPageExpectedTitle = "Selenium Txt";

		if (seleniumPageActualTitle.equals(seleniumPageExpectedTitle) ) {
			System.out.println("Actual page Title : "+seleniumPageActualTitle);
			System.out.println("Expected page Title : "+seleniumPageExpectedTitle);
			System.out.println("Selenium Search Success");
		}else {
			System.out.println("Titel of the Page is not as expected");
		}
		
	//	assertEquals(seleniumPageExpectedTitle, seleniumPageActualTitle);
		Thread.sleep(2500);
		driver.close();
	}

}
