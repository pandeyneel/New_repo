package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import testNG.Baselibrary;

public class Datepick extends Baselibrary
{
	public Datepick()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#widget\"]")
	private WebElement Widget ;
	@FindBy(xpath = "//*[text()='date picker']")
	private WebElement datepick ;
	@FindBy(xpath = "//*[@id=\"datePickerContainer\"]/div[1]/div[2]/input")
	private WebElement dateform;
	public void widgetclick()
	{
		Widget.click();
	}
	public void datepick()
	{
		datepick.click();
	}
	public void dateform()
	{
		dateform.click();
	}
	public void dateselect()
	{
		dateform.sendKeys(Applicationutility.datepic());
	}

}
