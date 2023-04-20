package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testingjava_pages.Autocomplete_page;

public class Autocomplete_Test extends Baselibrary
{
	Autocomplete_page ob;
	@BeforeTest
	public void getlauch()
	{
		baselibrary("https://www.testingbaba.com/old/");
	}
@Test
public void reachthepage() throws InterruptedException
{
	ob.reachthepage();
}
@Test
public void sendkeys()
{
	ob.sendkeys();
}
}
