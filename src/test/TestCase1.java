package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.baseClass;

public class TestCase1 extends baseClass{


public static void main(String[] args) throws Exception {

String firstName="First Name";

String lastName="Last Name";


TestCase1 testCase=new TestCase1();



driver= testCase.launchBrowser("Chrome");

driver.navigate().to("http://automationpractice.com");
//driver.navigate().to("http://automationpractice.com/&quot");


driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.linkText("Sign in")).click();




WebElement createAccountButton= driver.findElement(By.id("SubmitCreate"));

if(createAccountButton.isDisplayed()) {

//driver.findElement(By.id("email_create")).sendKeys("cybersucess@yopmail.com");
	driver.findElement(By.id("email_create")).sendKeys("cybersucessbizzzzzzzz@yopmail.com");
createAccountButton.click();




if(driver.findElement(By.xpath("//a[@class='home']/following-sibling::span[2]")).getText().contains("Authentication")) {
System.out.println("Successfully able to validate the create account page");
}
else {
throw new Exception("Unable to land on the create account page");
}





driver.findElement(By.id("id_gender1")).click();


driver.findElement(By.id("customer_firstname")).sendKeys(firstName);

driver.findElement(By.id("customer_lastname")).sendKeys(lastName);

driver.findElement(By.id("passwd")).sendKeys("123456789");


testCase.selectByIndex(driver.findElement(By.id("days")), 10);
testCase.selectByValue(driver.findElement(By.id("months")), "12");
testCase.selectByIndex(driver.findElement(By.id("years")), 2);

//driver.findElement(By.id("newsletter")).click();

/*
* if(driver.findElement(By.id("firstname")).getText().contains(firstName)) {
* System.out.
* println("Successfully able to validate the first name in address section");
* 
* }else { throw new
* Exception("The first name does not match with the first name of address section "
* ); } if(driver.findElement(By.id("lastname")).getText().contains(lastName)) {
* System.out.
* println("Successfully able to validate the last name in address section");
* 
* }else { throw new
* Exception("The last name does not match with the first name of address section "
* ); }
*/
driver.findElement(By.id("address1")).sendKeys("Test Address");

driver.findElement(By.id("city")).sendKeys("Pune");

testCase.selectByIndex(driver.findElement(By.id("id_state")), 3);

driver.findElement(By.id("postcode")).sendKeys("12455");

driver.findElement(By.id("phone_mobile")).sendKeys("123456789");

driver.findElement(By.id("submitAccount")).click();


}

 testCase.closeBrowserInstance();


}


}
