package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {
	
	public static ChromeDriver driver;

	//This method will validate the title of the page
	public static void validateTitle(String actualTitle, String expectedTitle) throws Exception {
		
		if(actualTitle.equals(expectedTitle)) {
			
			System.out.println("The title of the page is: "+ actualTitle);
		}
		else {
			throw new Exception("Invalid title for "+ expectedTitle);
		}
	}

	public static void main(String[] args) throws Exception {
		
		//set the chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Online Selenium\\Browser Drivers\\chromedriver.exe");
		
		//create instance of the chrome driver
		WebDriver driver =new ChromeDriver();

		//navigate to mentioned url
		driver.navigate().to("https://fb.com"); 
		
		driver.navigate().to("https://gmail.com");
			
		//the control will move to forward direction
		driver.navigate().back();
		
		validateTitle(driver.getTitle(),"Facebook – log in or sign up");
		
		//the control will move to forward direction
		driver.navigate().forward();
		
		validateTitle(driver.getTitle(),"Gmail - Email from Google");
		
		
	}

}