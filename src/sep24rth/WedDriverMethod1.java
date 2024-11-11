package sep24rth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WedDriverMethod1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		//driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(3000);
		
		//driver.close();
		driver.quit();
 
	}

}
