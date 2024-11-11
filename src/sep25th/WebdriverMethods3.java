package sep25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods3 {

	public static void main(String[] args) throws InterruptedException {
	
    WebDriver driver= new ChromeDriver();
    
    driver.get("https://adactinhotelapp.com/");
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    driver.findElement(By.linkText("New User Register Here")).click();
    
    Thread.sleep(3000);
    System.out.println(driver.getTitle());
    
    driver.navigate().back();
    
    Thread.sleep(3000);
    System.out.println(driver.getTitle());
    driver.navigate().forward();
    
    driver.navigate().to("https://www.facebook.com/login/");
    Thread.sleep(3000);
    System.out.println(driver.getTitle());
    driver.quit();
    
    	
    

	}

}
