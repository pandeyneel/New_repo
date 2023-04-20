package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Change_window_tab_page;

public class Change_window_tab_test extends Baselibrary
{
	Change_window_tab_page ob;
	@BeforeTest
	public void getlaunchbrowser()
	{
		baselibrary("https://www.testingbaba.com/old/");
		ob=new Change_window_tab_page();
	}
	@Test(priority=1)
	public void clickonalert()
	{
		ob.alertframe();
	}
	@Test(priority=2)
	public void  browser()
	{
		ob.window();
	}
	@Test(priority=3)
	public void clickontab()
	{
		ob.newtab(1);
	}
	

}
