package testingjava_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testNG.Baselibrary;

public class AAA extends Baselibrary
{public void getlaunch()
	{
	baselibrary("https://www.timesjobs.com/");
	}
	public static void main(String[] args) {
		AAA ob=new AAA();
		ob.getlaunch();
	}

}
