package test;


import java.util.Set;


import org.openqa.selenium.By;


import main.baseClass;


public class WindowHandling extends baseClass {


public static void main(String[] args) {


WindowHandling handling= new WindowHandling();

driver=handling.launchBrowser("Chrome");

driver.navigate().to("https://amazon.in");

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
driver.findElement(By.id("nav-search-submit-button")).click();

  

String parentWindowId=driver.getWindowHandle();

System.out.println("Parent Window is :"+parentWindowId);                    

   

driver.findElement(By.xpath("//div[@data-asin='B08696XB4B']//h2/a")).click();



@SuppressWarnings("unused")
String childFirstWindow="";



Set<String> allWindows=driver.getWindowHandles();

for(String windowId: allWindows) {

     if(!windowId.equals(parentWindowId)) {

                                                      // childFirstWindow=windowId;
     
     driver.switchTo().window(windowId);         // switch to window () he wali window
     System.out.println(driver.getTitle());

     driver.close();
    }

}
driver.switchTo().window(parentWindowId);

System.out.println(driver.getTitle());

}


}

