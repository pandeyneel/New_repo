package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Guru99loginpage;

public class Guru99test extends Baselibrary
{
	Guru99loginpage ob;
	@BeforeTest
	public void launch()
	{
		baselibrary("https://www.demo.guru99.com/V4/");
		ob=new Guru99loginpage();
	}
	@Test(priority=1)
	public void id()
	{
		ob.filltheid();
	}
	@Test(priority=2)
	public void password()
	{
		ob.fillpassword();
	}
	@Test(priority=3)
	public void login()
	{
		ob.clickonlogin();
	}
	@Test(priority=4)
	public void varification() throws InterruptedException
	{
		ob.getvarification();
	}

}
