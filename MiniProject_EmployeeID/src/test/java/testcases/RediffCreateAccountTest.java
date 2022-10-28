package testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffCreateAccountTest {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://register.rediff.com/register/register.php";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximize the window to device screen size
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3500);
		
		WebElement day =  driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		
		Select dayOption = new Select(day);
	 List<WebElement> optionsVal = 	dayOption.getAllSelectedOptions();
	 for (WebElement webElement : optionsVal) {
		
		 System.out.println(webElement.getText());
	}
	 
		dayOption.selectByValue("31");
		Thread.sleep(2500);
		dayOption.selectByVisibleText("25");
		Thread.sleep(2500);
		dayOption.selectByIndex(1);
		
		 List<WebElement> optionsVal1 = dayOption.getOptions();
		 for (WebElement webElement : optionsVal1) {
			
			 System.out.println(webElement.getText());
		}
		 
		Thread.sleep(2500);
		driver.close();
	}
}
