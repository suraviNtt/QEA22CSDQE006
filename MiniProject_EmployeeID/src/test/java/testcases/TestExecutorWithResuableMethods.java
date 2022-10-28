package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import browserSetup.BrowserSetup;
import reader.PropertiesReader;
import utitils.CommonMethods;

public class TestExecutorWithResuableMethods {

	
	public static void main(String[] args) throws InterruptedException {
		
		PropertiesReader pr = new PropertiesReader();

		String browsername = pr.getBrowserName();
		String url = pr.getURL();
		String searchText = "Selenium";
		String firstSearchResultXpath = "(//div[@id='rso']//a)[1]";
		String listOfSerachResults = "//*[@id='rso']//h3";
		String listOfActiveLinks = "//a";
		
		BrowserSetup browserSetup = new BrowserSetup();
		CommonMethods commonMethods = new CommonMethods();
		WebDriver driver = browserSetup.getDriver(browsername);
		driver.get(url);
		
		List<WebElement> activeLinks =	driver.findElements(By.xpath(listOfActiveLinks));
		System.out.println("Total number of active links on page : "+activeLinks.size());
		for (WebElement webElement : activeLinks) {
		String heading =	webElement.getText();
		if(heading != null || heading != "" || heading != " " || heading != "	")
		System.out.println("Search Result Haeding : "+ heading);
		}


		WebElement searchBox = driver.findElement(By.name("q"));
		try {
		searchBox.sendKeys(searchText);
		searchBox.sendKeys(Keys.ENTER);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		List<WebElement> searchResults =	driver.findElements(By.xpath(listOfSerachResults));
		System.out.println("Total number of search results displayed is : "+searchResults.size());
		for (WebElement webElement : searchResults) {
		String heading =	webElement.getText();
		if(heading != null || heading != "" || heading != " " || heading != "	")
		System.out.println("Search Result Haeding : "+ heading);
		}

		Thread.sleep(pr.getHardWait());
		WebElement firstSearchResult = driver.findElement(By.xpath(firstSearchResultXpath));
		
	System.out.println(firstSearchResult.getAttribute("data-ved"));
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
