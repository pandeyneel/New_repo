package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Changeframe;

public class Changeframetest extends Baselibrary
{
	Changeframe ob;
	@BeforeTest
	public void getlaunch()
	{
		baselibrary("https://www.testingbaba.com/old");
		ob=new Changeframe();
	}
	@Test(priority=1)
	public void clickonalertframe() throws InterruptedException
	{
		ob.framealert();
	}
	@Test(priority=2)
	public void clickonframe() throws InterruptedException
	{
		ob.framesclick();
	}
	@Test(priority=3)
	public void clickonparentframe()
	{
		ob.parenttframe();
	}
	@Test(priority=4)
	public void getdata()
	{
		ob.readdata();
		
	}
	@Test(priority=5)
	public  void getdata2()
	{
		ob.child();
	}

}
