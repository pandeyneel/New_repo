package testNG;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Button_page;

public class Button_test extends Baselibrary
{
	Button_page ob;
	@BeforeTest
	public  void getbrowser()
	{
		baselibrary("https://www.testingbaba.com/old");
		ob=new Button_page();
	}
	@Test(priority=1)
	public void clickonelement()
	{
		ob.cliconelement();
	}
	@Test(priority=2)
	public void clickonbutton() throws InterruptedException
	{
		ob.clickonbutton();
	}
	@Test(priority=5)
	public void doubleclick()
	{
		ob.doubleclickbutton();
	}
	@Test(priority=4)
	public void rightclick()
	{
		ob.clickonright();
	}
	@Test(priority=3)
	public void click()
	{
		ob.clickonclick();
	}

}
