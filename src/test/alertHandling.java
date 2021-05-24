package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import main.baseClass;


public class alertHandling extends baseClass {


public static void main(String[] args) {


alertHandling obj= new alertHandling();

driver=obj.launchBrowser("Chrome");

driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");




WebElement rightClickButton=driver.findElement(By.xpath("//h2[@id='example-code-simple-context-menu']/preceding::span[1]"));



Actions actions=new Actions(driver);    // chrome pe meko action perform karna hai yseliye driver liya

actions.contextClick(rightClickButton)   // contextClick method  will perform right click 
.sendKeys(Keys.ARROW_DOWN)
.sendKeys(Keys.ARROW_DOWN)
.sendKeys(Keys.ARROW_DOWN)
.sendKeys(Keys.ENTER)
.build()                                // build is bind all contextclick and arrow down and perform operation
.perform();






Wait<WebDriver> wait=new WebDriverWait(driver,10);

wait.until(ExpectedConditions.alertIsPresent());




String alertMessage=driver.switchTo().alert().getText();



if(alertMessage.equals("clicked: copy")) {

System.out.println("Successfully able to validate the alert message  and message is :" + alertMessage);
}else {

System.out.println("The text present on alert is incorrect");
}






driver.switchTo().alert().accept();               //.sendKeys("");




if(rightClickButton.isEnabled()) {

System.out.println("The alert is acepted successfully and the right click is enabled");

}else {
System.out.println("The alert is acepted but and the right click is not enabled");
}



}


}