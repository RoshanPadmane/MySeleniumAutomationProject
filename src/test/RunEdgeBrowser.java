package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class RunEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "E:\\Online Selenium\\Browser Drivers\\msedgedriver.exe");
		
		
		WebDriver driver= new EdgeDriver();
		driver.get("http://www.facebook.com");
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
