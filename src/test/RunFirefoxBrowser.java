package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.gecko.driver", "E:\\Online Selenium\\Browser Drivers\\geckodriver.exe");
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
