package testNG;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_excellperiodicity extends Baselibrary
{
	excelperiodic_test ob;
	@BeforeTest
	public void getlaunchbrowser()
	{
		
		baselibrary("https://www.testingbaba.com/old");
		ob=new  excelperiodic_test();
	}
	//@Test(priority=1)
	//public void clickonWebtable()
	{
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//ob.clickonWebtable();
	}
	@Test(priority=2)
	public void clickoniframe()
	{
		ob.clickoniframe();
	}
		
@Test(priority=3)
public void filldata()
{
	ob.filldata();
}
@Test(priority=4)
public void clickonlinks()
{
	ob.clickonlinks();
}
@Test(priority=5)
public void clickonclosebtn()
{
	ob.clickonclosebtn();
}

}
