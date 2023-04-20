package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAA 
{public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pakas\\git\\repository\\Hello_project\\latestchrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.guru99.com/select-option-dropdown-selenium-webdriver.html");
		driver.manage().window().maximize();
	}

}
