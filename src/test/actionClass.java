package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import main.baseClass;


public class actionClass extends baseClass{


public static void main(String[] args) {


			actionClass obj=new actionClass();
			
			driver=obj.launchBrowser("Chrome");
			
			//driver.navigate().to("http://automationpractice.com");





			Actions actions=new Actions(driver);
			
			       //actions.click(driver.findElement(By.linkText("Contact us"))).perform();       //or

			//actions.moveToElement(driver.findElement(By.linkText("Contact us"))).click().build().perform();
			
			
			

			driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
  
			WebElement object1= driver.findElement(By.xpath("//div[@id='products']/descendant::a[2]"));
			  
			WebElement object2= driver.findElement(By.id("amt7"));
			
			
  
  
			
			actions.moveToElement(object1).clickAndHold(object1).release(object2).build().perform();   // moveto element methd use bhi nhi kiya to chalta aur 
			                                                                                           //  aaje piche likha to bhi chalta
  
			
			
            // actions.dragAndDrop(object1, object2).perform();  
			
			                     //source, destination


}


}