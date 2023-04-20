package syntax_check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdownpage 
{public static  WebDriver driver;
	public  void laucnh()
	{
	 
	  
	 System.setProperty("Webdriver.driver.Chromedriver", "C:\\Users\\pakas\\git\\repository\\Hello_project\\NewDriver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.testingbaba.com/newdemo.html");
	}
	public Dropdownpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-target=\"#widget\"]")
	WebElement widget;
	@FindBy(xpath="//*[@href=\"#tab_24\"]")
	WebElement selectmenu;
	@FindBy(xpath = "//*[@class=\"tab-pane fade active show\"]")
	WebElement parent;
	@FindBy(xpath = "//*[@class=\"form-control\"]")
	WebElement child;
	
	public void clickonelements() throws InterruptedException
	{
		widget.click();
		Thread.sleep(2000);
		selectmenu.click();
		
	}
	public void parentchild()
	{
		
	}
	

}
