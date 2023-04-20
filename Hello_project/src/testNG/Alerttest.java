package testNG;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Alertpages;

public class Alerttest extends Baselibrary
{
	Alertpages ob;
	@BeforeTest
	public void launch()
	{
		baselibrary("https://www.testingbaba.com/old");
		ob=new Alertpages();
	}
	@Test(priority=1)
	public void reachthealrtpage() throws InterruptedException
	{
		ob.reachthealrtpage();
	}
	@Test(priority=2)
	public void readonly()
	{
		ob.readonly();
	}
	@Test(priority=3)
	public void waitfor5second() throws InterruptedException
	{
		ob.waitfor5second();
	}
	@Test(priority=4)
	public void confirmbox()
	{
		ob.confirmbox();
	}
	@Test(priority=5)
	public void proompt()
	{
		ob.proompt();
	}


}
