package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class emiCalculator {
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void emiCalculator()
	{
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);		
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), 
										driver.findElement(By.xpath("//div[@id='droppable']")))
		////to execute the above   we add driver.switchTo().frame(0);
				 .build()
				 .perform();
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	

}