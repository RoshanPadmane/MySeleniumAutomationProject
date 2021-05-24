package test;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import main.baseClass;


public class PaytmAssignment  extends baseClass{


public static void main(String[] args) throws InterruptedException {

PaytmAssignment obj=new PaytmAssignment();

driver=obj.launchBrowser("Chrome");

driver.manage().window().maximize();
driver.navigate().to("https://paytm.com");

JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("window.scrollBy(0,500);");

Wait<WebDriver> wait=new WebDriverWait(driver,10);

wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-reactid='458']"))));



//whenever your do m is not allowing you to access that web element in that case you get stale element exception
//An s is use refresh method or hitting that element until you get result preferable is referesh method

//driver.navigate().refresh();

//js.executeScript("arguments[0].setAttribute('style','background:blue; border: 2px solid red;');", driver.findElement(By.xpath("//*[@data-reactid='488']")));




  driver.findElement(By.xpath("//*[@data-reactid='488']")).click();
  
		
		  driver.navigate().refresh(); Thread.sleep(3000);
		  
		  WebElement cost=driver.findElement(By.xpath("//span[@class='_1V3w']"));
		  
		  System.out.println(cost.getText());
		  
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.
		  xpath("//button[@class='_2CNI']"))));
		  
		  System.out.println(driver.findElement(By.xpath("//span[@class='_1y_y']")).
		  getText()); Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//span[@class='_1y_y']")).click();
		 
 
}



}