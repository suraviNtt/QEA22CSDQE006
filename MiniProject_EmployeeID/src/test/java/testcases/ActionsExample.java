package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserSetup.BrowserSetup;
import reader.PropertiesReader;
import utitils.CommonMethods;
import utitils.PathReader;

public class ActionsExample {
	
	public static void main(String[] args) {
		
		PropertiesReader propertiesReader = new PropertiesReader();
		CommonMethods commonMethods = new CommonMethods();
		WebDriverWait wait = null;

		String url = "https://demo.guru99.com/test/drag_drop.html";
		// xpaths
		String elementToBeMovedXpath = "(//*[@id='products']//li)[2]/a";
		String destinationElementId = "amt7";

		WebDriver driver = BrowserSetup.getDriver(propertiesReader.getBrowserName(),
				propertiesReader.getImplicitWait());
		Actions actions = new Actions(driver);
		wait =  (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(propertiesReader.getExplicitWait()))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);

		commonMethods.launchApplication(driver, url);
		WebElement elementToMove = driver.findElement(By.xpath(elementToBeMovedXpath));
		WebElement destination = driver.findElement(By.id(destinationElementId));
		actions.dragAndDrop(elementToMove, destination).build().perform();
		
		//screenshot
		PathReader pr = new PathReader();
		File scrsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrsht, new File(pr.saveImgFileInScreenShootLocation(destinationElementId)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	
	}

}
