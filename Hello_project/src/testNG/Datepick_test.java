package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import applicationutility.Applicationutility;
import testingjava_pages.Datepick;

public class Datepick_test extends Baselibrary
{
	Datepick ob;
	@BeforeTest
	public void getlaunch()
	{
		baselibrary("https://www.testingbaba.com/old/");
		ob= new Datepick(); 
	}
	@Test(priority=1)
	public void widgetclick()
	{
		ob.widgetclick();
	}
	@Test(priority=2)
	public void datepick()
	{
		ob.datepick();
	}
	@Test(priority=3)
	public void dateform()
	{
		ob.dateform();
	}
	@Test(priority=4)
	public void dateselect()
	{
		ob.dateselect();
	}

}
