package mavenpackage;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import testNG.Baselibrary;

public class Githubloginpagetest extends Baselibrary

{
	Githubloginpage ob;
	@BeforeTest
	public void getlaunch()
	{
		baselibrary("https://github.com/");
		ob=new Githubloginpage();
	}
	@Test
	public void  clickonsignin()
	{
		ob.clickonsignin();
	}
	@Test
	public void sendusername()
	{
		ob.senddatainusername();
	}
	@Test
	public void sendpassword()
	{
		ob.senddatainpassword();
	}
	@Test
	public void submitbutton()
	{
		ob.clickonsubmitbutton();
	}
	

}
