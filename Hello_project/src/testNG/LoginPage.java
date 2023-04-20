package testNG;

public class LoginPage extends Baselibrary
{
	public void gettitle()
	{
		String title=driver.getTitle();
		System.out.println("Title is"+title);
	}


}
