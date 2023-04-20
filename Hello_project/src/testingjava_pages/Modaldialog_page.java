package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Modaldialog_page extends Baselibrary
{
	public Modaldialog_page()
	{
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath ="//*[@data-target=\"#alerts\"]" )
		private WebElement alertframewindow;
	    @FindBy(xpath = "//*[text()='modal dialogs' and @href=\"#tab_15\"]")
	    private WebElement modalpage;
	    @FindBy(xpath = "//*[@data-target=\"#exampleModal1\"]")
	    private WebElement firstbutton;
	    @FindBy(xpath ="//*[@data-target=\"#exampleModal2\"]" )
	    private WebElement secondbutton;

public  void reachthepage() throws InterruptedException
{
	alertframewindow.click();
	Thread.sleep(2000);
	modalpage.click();
}
public void firstbutton()
{
	firstbutton.click();
	//driver.switchTo().alert().getText();
	driver.switchTo().alert().dismiss();
}
public void secondbutton()
{
	secondbutton.click();
	//driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
}
}
