package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettingLinks {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Online Selenium\\Browser Drivers\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();		
	
		driver.get("https://paytm.com");
		
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement element:links) {
			
			
			System.out.println(element.getAttribute("href"));
		}
		driver.quit();
	}
	

}
