package testingjava_pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNG.Baselibrary;


public class Testbox_test extends Baselibrary 
{
	Testbox_page ob;
	@BeforeTest
	public void getlaunchbrowser()
	{
		baselibrary("https://www.testingbaba.com/old");
		ob=new Testbox_page();
		
	}
	@Test(priority=1)
	public void elements()
	{
		ob.elements();
	}
	@Test(priority=2)
	public void  textbox()
	{
		ob.textbox();
	}
	@Test(priority=3)
	public void getfilldetails()
	{
		ob.getfilldetails();
	}
	@Test(priority=4)
	public void clicksubmit()
	{
		ob.clicksubmit();
	}
	@Test(priority=5)
	public void getvarrified()
	{
		ob.getvarrified();
	}

}
