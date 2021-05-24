package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintMobileNames {

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
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		
	
		/*
		
		List<WebElement> mobileNames=driver.findElements(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]//div[@class='_4rR01T']"));
		
		for(WebElement element: mobileNames) {
			  
			  System.out.println(element.getText());
			  }
	*/
		
		
		
		Thread.sleep(1000);
		for(int i=2;i<=25;i++) {
			
			
		
			
			  
			  WebElement mobileNames=driver.findElement(By.xpath("//div [@class='_1YokD2 _2GoDe3']/div[2]/div[" + i +"]//div[@class='_4rR01T']"));
			  
			  System.out.println("Mobile Name is :" + mobileNames.getText());
			  
			  }
			  
		
		
		
		driver.quit();
	}

}
