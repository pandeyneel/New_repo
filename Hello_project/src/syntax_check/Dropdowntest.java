package syntax_check;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdowntest 
{
	public static Dropdownpage ob;
	@BeforeTest
	public void getlaucnh()
	{
		ob.laucnh();
		ob=new Dropdownpage();
	}
	@Test
	public void clickonelements() throws InterruptedException
	{
		ob.clickonelements();
	}

}
