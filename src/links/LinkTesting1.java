 package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.linkText("login_forgot")).getAttribute("href"));
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(3000);
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		

	}

}
