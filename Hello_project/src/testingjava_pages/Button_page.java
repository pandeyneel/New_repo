package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Button_page extends Baselibrary
{
	public Button_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	@FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[5]")
	private WebElement button;
	@FindBy(xpath = "//*[@ondblclick=\"doubletext()\"]")
	private WebElement doubleclickbutton;
	@FindBy(xpath = "//*[@id=\"noContextMenu\"]")
	private WebElement rightclick;
	@FindBy(xpath = "//*[@onclick=\"clicktext()\"]")
	private WebElement click;
	
	public void cliconelement()
	{
		elements.click();
	}
	public void clickonbutton() throws InterruptedException
	{
	Thread.sleep(3000);
		button.click();
	}
	public void doubleclickbutton()
	{
		Actions act=new Actions(driver);
		act.doubleClick(doubleclickbutton).perform();
		
	}
	public void clickonright()
	{
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
	}
	public void clickonclick()
	{
		click.click();
	}
	
	

}
