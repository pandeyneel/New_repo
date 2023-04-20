package testingjava_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Changeframe extends Baselibrary
{
	public Changeframe()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
private WebElement framealert;
@FindBy(xpath = "//*[text()='frames' and @href=\"#tab_13\" ]")
private WebElement frames;
@FindBy(xpath = "//*[@title=\"Iframe Example\" and @style=\"height:200px;width:400px\"]")
private WebElement parentframe;
@FindBy(xpath = "//*[@id=\"tab_13\"]/p")
private WebElement chileframe;

public void framealert() throws InterruptedException
{
Thread.sleep(3000);
	framealert.click();
}
public void framesclick() throws InterruptedException
{
	Thread.sleep(3000);
	frames.click();
}
public void parenttframe()
{
	parentframe.click();
}
public void readdata()
{
driver.switchTo().frame(parentframe);
//String Text = driver.findElement(By.id("Text")).getText();
String text=driver.findElement(By.xpath("/html/body/h1")).getText();
System.out.println(text);
}
public void child()
{
	chileframe.click();
	driver.switchTo().frame(chileframe);
	String text1=driver.findElement(By.xpath("//*[@id=\"tab_13\"]/p/text()")).getText();
	System.out.println(text1);
}
}
