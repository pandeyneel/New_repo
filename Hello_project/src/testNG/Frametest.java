package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Framespages;

public class Frametest extends Baselibrary
{
	Framespages ob;
	@BeforeTest
	public void launch()
	{
		baselibrary("https://www.testingbaba.com/old");
		ob=new Framespages();
	}
	@Test(priority=1)
	public void openthepage() throws InterruptedException
	{
		ob.openthepage();
	}
	@Test(priority=2)
	public void frame1read()
	{
		ob.frame1read();
	}

}
