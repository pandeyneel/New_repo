package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Upload;

public class Upload_test extends Baselibrary
{
	Upload op;
	
	@BeforeTest
	public void getlaunch()
	{
		baselibrary("https://www.testingbaba.com/old/");
		
	}
	
	@Test(priority=1)
	public void clickonelement()
	{
		
		op.elements();
		 
	}
	//@Test(priority=2)
	//public void upload() throws InterruptedException
	{
		
		//op.upload_download();
	}
	//@Test(priority=3)
	//public void selectfile()
	{
		//op.selectfile();
		
	}

}
