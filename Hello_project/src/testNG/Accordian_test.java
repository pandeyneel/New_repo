package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Accordian_page;

public class Accordian_test extends Baselibrary
{
	Accordian_page ob;
	@BeforeTest
	public void getlaunch()
	{
		baselibrary("https://www.testingbaba.com/old/");
		ob=new Accordian_page();
	}
	@Test
	public void reachthepage() throws InterruptedException
	{
		ob.reachthepage();
	}
	@Test
	public void readfirstaccordian()
	{
		ob.readfirstaccordian();
	}
	@Test
	public void readsecondaccordian() throws InterruptedException
	{
		ob.readsecondaccordian();
	}

}
