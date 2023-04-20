package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Download_upload_page;

public class Download_upload_test extends Baselibrary
{
	Download_upload_page ob;
	@BeforeTest
	
	public void getlaunch()
	{
		baselibrary("https://www.testingbaba.com/old");
		ob=new Download_upload_page();
	}
	@Test
	public  void clickonelement()
	{
		ob.elements();
	}

}
