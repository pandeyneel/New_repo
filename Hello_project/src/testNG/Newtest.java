package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtest 
{
	@BeforeSuite
	public void setup()
	{
		System.out.println("setup syster property from Chrome");
	}
	@BeforeClass
	public void launchbrowser()
	{
		System.out.println("launch chrome Browser");
		
	}
	
	@BeforeMethod
	public void enterurl()
	{
		System.out.println("enter url");
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("login method");
	}
	@Test
	public void googletitletest()
	{
		System.out.println("Google  title test");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("do logout");
	}
	@AfterTest
	public void deletecookies()
	{
		System.out.println("delete all the cookies");
		
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("Close the Browser");
		
	}
	@AfterSuite
	public void generatereport()
	{
		System.out.println("generate report");
	}

}
