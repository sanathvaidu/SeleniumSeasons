package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void rightClickTest()
	{
		Actions actions=new Actions(driver);
		actions.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
		.pause(2000)
		.keyDown(Keys.ARROW_DOWN)
		.pause(2000)
		.keyDown(Keys.ARROW_DOWN)
		.pause(2000)
		.keyDown(Keys.ARROW_DOWN)
		.pause(2000)
		.keyDown(Keys.ENTER )
		.build()
		.perform();
		//driver.findElement(By.xpath("//span[text()='Paste']")).click();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	

}