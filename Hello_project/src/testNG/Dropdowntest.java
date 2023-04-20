package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Droppdown;

public class Dropdowntest extends Baselibrary
{
	Droppdown ob;
	@BeforeTest
	public void launch()
	{
		baselibrary("https://www.testingbaba.com/old/newdemo.html");
		ob=new Droppdown();
	}
	@Test(priority=1)
	public void tothepoint() throws InterruptedException
	{
		ob.clickonelements();
	}
	@Test(priority=2)
	public void parentchile()
	{
		ob.parentchild();
	}
	@Test(priority=3)
	public void dropdown()
	{
		ob.dropdown();
	}
	
	

}
