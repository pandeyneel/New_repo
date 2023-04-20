package testingjava_pages;

import java.awt.Frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testNG.Baselibrary;

public class Droppdown extends Baselibrary
{
	public Droppdown()
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
		parent.click();
		driver.switchTo().frame(child);
		
	}
	public void dropdown()
	{
		Select sl=new Select(child);
		sl.deselectByVisibleText("Group 1, Option 1");
	}
}
