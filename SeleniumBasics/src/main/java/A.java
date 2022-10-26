package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	
	public static void main(String[] args) {
		
		String driverLocation = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
