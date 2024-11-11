package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	
	 driver.findElement(By.id("username")).sendKeys("reyaz0806");
		 
		 driver.findElement(By.name("password")).sendKeys("reyaz123");
		 
		 driver.findElement(By.id("login")).click(); 
		 
		 WebElement drop= driver.findElement(By.className("search_combobox"));
		List<WebElement> allItems=drop.findElements(By.tagName("option"));
		System.out.println("no of items:   "+allItems.size());
		
		WebElement drop2= driver.findElement(By.className("search_combobox"));
		List<WebElement> allItems2=drop2.findElements(By.tagName("option"));
		System.out.println("no of items:   "+allItems2.size());
		
		 
		Thread.sleep(3000);
		 driver.quit();
		
		 

	}

}
