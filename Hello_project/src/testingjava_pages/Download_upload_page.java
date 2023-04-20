package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Download_upload_page extends Baselibrary
{
	public Download_upload_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	@FindBy(xpath = "//*[text()='upload and download']")
	private WebElement upload_download;
	@FindBy(xpath = "//*[@id=\"File1\"]")
	private WebElement selectfile;
	
	public void elements()
	{
		
		elements.click();
	}

}
