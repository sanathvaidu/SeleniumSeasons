package sep27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods3 {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/" );
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).click();
		
		System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		System.out.println(driver.findElement(By.id("username")).getLocation().getY());
	    System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
	    System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
	    
	    // getLocation and getSize and GetRect both are working as same 
	    
		System.out.println(driver.findElement(By.id("username")).getRect().getX());
		System.out.println(driver.findElement(By.id("username")).getRect().getY());
	    System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
	    System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
	    
	    System.out.println(driver.findElement(By.id("username")).getTagName());
		
		driver.quit();
		
	}

}
