package testingjava_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class NestedFrame_page extends Baselibrary 

{
public NestedFrame_page()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//*[@data-target=\"#alerts\"]" )
private WebElement alertframewindow;
@FindBy(xpath ="//*[text()='nested frames' and @href=\"#tab_14\" ]" )
private WebElement nestedframe;
@FindBy(xpath ="//*[@src=\"target1.html\" and @height=\"450px\" ]" )
private WebElement biggestframe;
@FindBy(xpath ="//*[@width=\"300\"]" )
private WebElement childframe;
@FindBy(xpath ="//*[@src=\"text.html\" and @width=\"500\"]" )
private WebElement parentframe;
@FindBy(xpath = "//*[text()='Click Here']")
private WebElement button;

public void reachthepage() throws InterruptedException
{
	alertframewindow.click();
	Thread.sleep(2000);
	nestedframe.click();
}
public void biggestframe()
{
	driver.switchTo().frame(biggestframe);
}
public void childframe() throws InterruptedException
{
	Thread.sleep(2000);
	driver.switchTo().frame(childframe);
	button.click();
	String text=driver.findElement(By.xpath("//*[text()='Hello']")).getText();
	System.out.println(text);
}
public void parentframe()
{
	driver.switchTo().parentFrame();
}
}
