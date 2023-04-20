package mavenpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Githubloginpage extends Baselibrary
{
	public Githubloginpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@href=\"/login\"]")
	private WebElement signinbutton;
	@FindBy(xpath="//*[@name=\"login\"]")
	private WebElement usenamebox;
	@FindBy(xpath="//*[@name=\"password\"]")
	private WebElement passwordbox ;
	@FindBy(xpath="//*[@name=\"commit\"]")
	private WebElement submitbutton;
	
	public void clickonsignin()
	{
		signinbutton.click();
	}
	public void senddatainusername()
	{
		usenamebox.sendKeys("pandeyneel");
	}
	public void senddatainpassword()
	{
		passwordbox.sendKeys("Itsneel@2022");
	}
	public void clickonsubmitbutton()
	{
		submitbutton.click();
	}
	

}
