package test;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import main.baseClass;


public class AutomationPractice  extends baseClass{


public static void main() throws AWTException {

	AutomationPractice obj=new AutomationPractice();
	
	driver=obj.launchBrowser("Chrome");
	
	driver.navigate().to("https://paytm.com");
	
	
	
	WebElement productLink=driver.findElement(By.xpath("//*[@data-reactid='269']"));
	
	Actions act=new Actions(driver);
	
	act.contextClick(productLink).perform();
	
	Robot robot=new Robot();
	robot.mouseMove(0, 1000);
	
	
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	
			/*
			 * robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
			 * 
			 * robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
			 */



}


}