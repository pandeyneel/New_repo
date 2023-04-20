package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbaselibrary 
{
	public static WebDriver driver;
	public void launchbrowser(String url)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pakas\\eclipse-workspace\\newbatchnileshpandey\\Hello_project\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
