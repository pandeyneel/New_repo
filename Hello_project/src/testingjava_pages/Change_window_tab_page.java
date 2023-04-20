package testingjava_pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Change_window_tab_page extends Baselibrary 

{
	public Change_window_tab_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement alertframe;
	@FindBy(xpath = "//*[@href=\"https://www.google.co.in/\"]")
	private WebElement newtab;
	@FindBy(xpath = "//*[@onclick=\"win1open()\"]")
	private WebElement newwindow;
	@FindBy(xpath = "//*[text()='New Window Message']")
	private WebElement msg;
	@FindBy(xpath = "//*[text()='browser windows']")
	private WebElement windowbroweser;
	
	public  void alertframe()
	{
		alertframe.click();
	}
	public void window()
	{
		windowbroweser.click();
	}
	public void newtab(int  tabno)
	{
		newtab.click();
		Set<String>set=driver.getWindowHandles();
		ArrayList<String> li=new ArrayList<String>(set);
		
		driver.switchTo().window(li.get(0));
	}

}
