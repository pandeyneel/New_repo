package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Autocomplete_page extends Baselibrary
{
	public Autocomplete_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#widget\"]")
	private WebElement widget;
	@FindBy(xpath = "//*[text()='auto complete' and @href=\"#tab_17\"]")
	private WebElement autocompletepage;
	@FindBy(xpath = "//*[@id=\"myInput\"]")
	private WebElement input;
	@FindBy(xpath = "")
	private WebElement extra;
	
	public void reachthepage() throws InterruptedException
	{
		widget.click();
		Thread.sleep(2000);
		autocompletepage.click();
	}
	public void sendkeys()
	{
		input.click();
		input.sendKeys("ind");
	}

}
