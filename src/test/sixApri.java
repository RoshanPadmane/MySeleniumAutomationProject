package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sixApri {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "E:\\Online Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//a[@href='https://www.flipkart.com/']/h3")).click();
		
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		//System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[3]/div[4]/div/div[2]/div/div[2]/a/div[1]/div")));
		
		
		
		Thread.sleep(1000);
		for(int i=2;i<=6;i++) {
			  
			  WebElement mobileNames=driver.findElement(By.xpath("/html/body/div/div/div[3]/div[4]/div/div["+i+"]/div/div[2]/a/div[1]/div"));
			  
			  System.out.println("Mobile Name is :" + mobileNames.getText());
			  
			  }
		
		driver.quit();
			  
		
		
		

	}

}
