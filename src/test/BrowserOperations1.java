package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import main.TitleEncapsulation;

public class BrowserOperations1 {
	static WebDriver driver;

	/*
	 *  This method will validate the title of the page
	 */	public static void validateTitle(String actualTitle, String expectedTitle) throws Exception {

		if (actualTitle.equals(expectedTitle)) {

			System.out.println("The title of the page is: " + actualTitle);
		} else {
			throw new Exception("Invalid title for " + expectedTitle);
		}
	}

	/*
	 * This method will launch the browser
	 */
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Online Selenium\\Browser Drivers\\chromedriver.exe");

		BrowserOperations1.driver = new ChromeDriver();

	}

	public static void main(String[] args) throws Exception {

		TitleEncapsulation titleEncapsulation = new TitleEncapsulation();
		
		launchChromeBrowser(); 

		/*
		 * navigate to mentioned url
		 */
		driver.navigate().to("https://fb.com");

		driver.navigate().to("https://gmail.com");

		/*
		 * the control will move to forward direction
		 */
		driver.navigate().back();

		/*
		 * Validate the title of the facebook pages by getter and setter method
		 */

		titleEncapsulation.setFacebookTitle(driver.getTitle());

		validateTitle(titleEncapsulation.getFacebookTitle(), "Facebook – log in or sign up");

		/*
		 * the control will move to forward direction
		 */
		driver.navigate().forward();

		/*
		 * Validate the title of the gmail pages by getter and setter method
		 */

		titleEncapsulation.setGmailTitle(driver.getTitle());

		validateTitle(titleEncapsulation.getGmailTitle(), "Gmail - Email from Google");

	}

}