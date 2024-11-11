package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTesting4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> allItems=drop.findElements(By.tagName("option"));
		System.out.println("no of items:   "+allItems.size());
		
		for(WebElement item:allItems)
		{
		System.out.println(item.getText());

	}
		driver.quit();
	}
}
