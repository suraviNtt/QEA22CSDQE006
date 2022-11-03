package testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserSetup.BrowserSetup;
import reader.PropertiesReader;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utitils.CommonMethods;

public class SwitchingWindowsTest {

	public static void main(String[] args) throws Exception {

		PropertiesReader propertiesReader = new PropertiesReader();
		CommonMethods commonMethods = new CommonMethods();
		WebDriverWait wait = null;

		String url = "https://www.amazon.in/s?k=mobile+smartphones+under+30000&crid=1D5LN8R0X2KL0&sprefix=%2Caps%2C191&ref=nb_sb_ss_recent_1_0_recent";
		// xpaths
		String firstSearchResultXpath = "(//span[@data-component-type='s-search-results']//a//img)[1]";

		WebDriver driver = BrowserSetup.getDriver(propertiesReader.getBrowserName(),
				propertiesReader.getImplicitWait());
		wait = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(propertiesReader.getExplicitWait()))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);

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
		System.out.println("Product title : " + productTitle.getText());

		commonMethods.closeCurrentBrowserWindow(driver);
		driver.switchTo().window(parentPage);
		System.out.println("Parent window title : " + driver.getTitle());

		//full page screenshot
		Screenshot scrsht = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000))
				.takeScreenshot(driver);
		BufferedImage bi = scrsht.getImage();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(bi, "png", baos);
		baos.flush();
		byte[] imageBytes = baos.toByteArray();
		Files.write(Paths.get("E://testingimag.png"), imageBytes);

		commonMethods.closeCurrentBrowserWindow(driver);

	}
}
