package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Modaldialog_page;

public class Modaldialog_test extends Baselibrary

{ Modaldialog_page ob;
@BeforeTest
public void getlaunch()
{
	baselibrary("https://www.testingbaba.com/old/");
	ob=new Modaldialog_page();
}
@Test(priority=1)
public  void reachthepage() throws InterruptedException
{
	ob.reachthepage();
}
@Test(priority=2)
public void firstbutton()
{
	ob.firstbutton();
}
@Test(priority=3)
public void secondbutton()
{
	ob.secondbutton();
}

}
