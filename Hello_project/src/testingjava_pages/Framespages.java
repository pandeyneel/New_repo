package testingjava_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Baselibrary;

public class Framespages extends Baselibrary
{
	public Framespages()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement framealert;
	@FindBy(xpath = "//*[@onclick=\"changeText(this)\" and @href=\"#tab_13\"]")
	private WebElement frames;
	@FindBy(xpath = "//*[@title=\"Iframe Example\" and @style=\"height:200px;width:400px\"]")
	private WebElement frame1;
	@FindBy(xpath = "//*[@title=\"Iframe Example\" and @style=\"height:80px;width:120px\"]")
	private WebElement frame2;
	
	public void openthepage() throws InterruptedException
	{
		framealert.click();
		Thread.sleep(2000);
		frames.click();
	}
	public void frame1read()
	{
		
		driver.switchTo().frame(frame1);
		String text=driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(text);
		driver.switchTo().frame(frame2);
		String text1=driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(text1);
		
	}

}
