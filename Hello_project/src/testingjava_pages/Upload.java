package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import testNG.Baselibrary;

public class Upload extends Baselibrary
{
	String path="C:\\Users\\pakas\\Downloads\\Untitled spreadsheet.xlsx";
	public Upload()
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
	public void upload_download() throws InterruptedException
	{
		Thread.sleep(3000);
		upload_download.click();
	}
	public void selectfile()
	{
		selectfile.click();
		Applicationutility.fileupload(path);
	}


}
