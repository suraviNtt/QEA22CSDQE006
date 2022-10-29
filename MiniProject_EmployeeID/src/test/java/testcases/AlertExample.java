package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import reader.PropertiesReader;
import utitils.AlertHandler;
import utitils.CommonMethods;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		PropertiesReader pr = new PropertiesReader();
		AlertHandler alertHandler = new AlertHandler();
		CommonMethods commonMethods = new CommonMethods();

		String url = "https://demo.guru99.com/test/delete_customer.php";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximize the window to device screen size
		driver.manage().window().maximize();
		// implicit wait
		int iw = pr.getImplicitWait();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(iw));
		driver.get(url);
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		commonMethods.clickOnWebElement(submitButton);
		
		wait.until(ExpectedConditions.alertIsPresent());
		alertHandler.dismissAlert(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		commonMethods.clickOnWebElement(submitButton);
		
		wait.until(ExpectedConditions.alertIsPresent());
		alertHandler.acceptAlert(driver);
		
		wait.until(ExpectedConditions.alertIsPresent());
		String s = alertHandler.getAlertText(driver);
		System.out.println(s);
		alertHandler.acceptAlert(driver);

//		alertHandler.sendDataToAlert(driver, "test");
	//	wait.until(ExpectedConditions.elementToBeClickable(By.name("value")));
		
	//	wait.until(ExpectedConditions.)

		Thread.sleep(2500);
		driver.close();
	}
}
