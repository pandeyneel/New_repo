package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Alertpages extends Baselibrary
{
	public Alertpages()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
private WebElement framealert;
@FindBy(xpath = "//*[text()='alerts']")
private WebElement alert;
@FindBy(xpath = "//*[text()='Click me' and @onclick=\"myalert()\"]")
private WebElement firstreadonly;
@FindBy(xpath = "//*[@onclick=\"aftersec5()\"]")
private WebElement afterseconds;
@FindBy(xpath = "//*[@onclick=\"myconfirm()\"]")
private WebElement confirmbox;
@FindBy(xpath = "//*[@onclick=\"myprompt()\"]")
private WebElement prompt;

public void reachthealrtpage() throws InterruptedException
{
	framealert.click();
	Thread.sleep(2000);
	alert.click();
}
public void readonly()
{
	firstreadonly.click();
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	driver.switchTo().alert().accept();
}
public void waitfor5second() throws InterruptedException
{
	afterseconds.click();
	Thread.sleep(5000);
	String Text=driver.switchTo().alert().getText();
	System.out.println(Text);
	driver.switchTo().alert().accept();
}
public void confirmbox()
{
	confirmbox.click();
	driver.switchTo().alert().accept();
}
public void proompt()
{
	prompt.click();
	driver.switchTo().alert().sendKeys("Neel");
	driver.switchTo().alert().accept();
}

}
