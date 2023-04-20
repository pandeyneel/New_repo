package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends Baselibrary
{
	LoginPage ob;
	@BeforeTest
	
	public void launch()
	{
		baselibrary("https://www.testingbaba.com/");
		ob=new LoginPage();
	}
	
	@Test
	public  void gettitle()
	{
		ob.gettitle();
	}
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}
}
