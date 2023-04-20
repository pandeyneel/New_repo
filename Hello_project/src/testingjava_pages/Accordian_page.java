package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import excelutility.Excelutility;
import testNG.Baselibrary;

public class Accordian_page extends Baselibrary

{
	public Accordian_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#widget\"]")
	private WebElement widget;
	@FindBy(xpath = "//*[text()='accordion' and @href=\"#tab_16\"]")
	private WebElement accordian;
	@FindBy(xpath = "//*[@id=\"collapse1\"]")
	private WebElement firstaccordiantext;
	@FindBy(xpath = "//*[@data-target=\"#collapse2\"]")
	private WebElement secondbutton;
	@FindBy(xpath = "//*[@id=\"collapse2\"]")
	private WebElement secondaccordiantext;
	
	public void reachthepage() throws InterruptedException
	{
		widget.click();
		Thread.sleep(2000);
		accordian.click();
	}
	public void readfirstaccordian()
	{
		System.out.println(firstaccordiantext.getText());
	}
	public void readsecondaccordian() throws InterruptedException
	{
		secondbutton.click();
		Thread.sleep(2000);
		System.out.println(secondaccordiantext.getText());
		Screenshot_utility.getscreenshot("paas", "dropdown");
		
	}
	

}
