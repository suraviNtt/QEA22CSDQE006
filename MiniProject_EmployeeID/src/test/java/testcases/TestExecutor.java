package testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Get mobiles smart phones from Amazon online store, which has:
 * 
 * Price less than Rs.30000 Mobiles which are newly arrived
 * 
 * @author Suravi
 *
 */
public class TestExecutor {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.google.com/";
		String searchText = "Selenium";
		String firstSearchResultXpath = "(//div[@id='rso']//a)[1]";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximize the window to device screen size
		driver.manage().window().maximize();
		driver.get(url);

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(searchText);
		searchBox.sendKeys(Keys.ENTER);

		WebElement firstSearchResult = driver.findElement(By.xpath(firstSearchResultXpath));
		firstSearchResult.click();

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
