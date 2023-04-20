package testingjava_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mergeclass 
{
WebDriver driver;
	
	@BeforeTest
	public  void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pakas\\Downloads\\chromedriver.exe");  
		 driver = new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://youtube.com");
	}
	@Test
	public void gettitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=1)
	public void type()
	{
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Pasoori song");
		
	}
	@Test(priority=2)
	public void search()
	{
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
	}
	@Test(priority=3)
	public void clickonsong()
	{
		driver.findElement(By.xpath("//*[@id=\"img\"]")).click();
	}
}
