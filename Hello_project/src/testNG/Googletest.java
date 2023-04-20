package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {
	
	WebDriver driver;
	
	@BeforeMethod
	public  void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pakas\\Downloads\\chromedriver.exe");  
		 driver = new ChromeDriver(); 
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://www.amazon.com");
	}
	
	@Test
	public void  titletest()
	{
		String  title=driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}
