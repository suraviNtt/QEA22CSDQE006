package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.guru99.com/test/delete_customer.php";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximize the window to device screen size
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3500);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().sendKeys("dara");
		
		Thread.sleep(2500);
		driver.close();
	}
}
