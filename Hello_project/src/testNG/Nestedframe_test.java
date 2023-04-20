package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.NestedFrame_page;

public class Nestedframe_test extends Baselibrary
{ NestedFrame_page ob;
@BeforeTest
public void geturl()
{
	baselibrary("https://www.testingbaba.com/old/");
	ob=new NestedFrame_page();
}
@Test(priority=1)
public void reachthepage() throws InterruptedException
{
	ob.reachthepage();
}
//@Test(priority=2)
//public void biggestframe()
{
	//ob.biggestframe();
}
@Test(priority=2)
public void childframe() throws InterruptedException
{
	ob.childframe();
}
//@Test(priority=4)
//public void parentframe()
{
	//ob.parentframe();
}

}
