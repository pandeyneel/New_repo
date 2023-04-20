package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Upload_download_page;

public class Upload_download_test extends Baselibrary
{
	Upload_download_page ob;
	@BeforeTest
	public void getlaunch()
	{
		baselibrary("https://www.testingbaba.com/old/");
		ob=new Upload_download_page();
		
	}
	@Test(priority=1)
	public void clickonelement()
	{
		ob.elements();
		 
	}
	@Test(priority=2)
	public void upload() throws InterruptedException
	{
		ob.upload_download();
	}
	@Test(priority=3)
	public void selectfile()
	{
		ob.selectfile();
		
		
	}
	//@Test(priority=4)
	//public void close()
	{
		//driver.close();
	}

}
