package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import excelutility.Excelutility;

public class excelperiodic_test extends Baselibrary
{ 
	//String path="C:\\Users\\pakas\\eclipse-workspace\\newbatchnileshpandey\\testdata\\newtestdata.xlsx";
	//String path="C:\\Users\pakas\Downloads\Untitled spreadsheet (1).xlsx"
	String path="C:\\Users\\pakas\\Downloads\\Untitled spreadsheet.xlsx";
	public excelperiodic_test()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[4]")
	//@FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[4]/div/iframe")
	private WebElement Webtable;
	@FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
	private WebElement iframeclick;
	@FindBy(xpath = "//*[@name=\"name\"]")
	private WebElement name;
	@FindBy(xpath = "//*[@name=\"email\"]")
	private WebElement email;
	@FindBy(xpath = "//*[text()='Save']")
	private WebElement save;
	
	public void clickonWebtable()
	{
		
		Webtable.click();
	}
	public void clickoniframe()
	{
		iframeclick.click();
	}
	
	public void filldata()
	{
		driver.switchTo().frame(iframeclick);
		for(int i=1;i<=5;i++)
		{
			name.sendKeys(Excelutility.getreaddata(path, i, 1));
			email.sendKeys(Excelutility.getreaddata(path, i, 2));
			save.click();	
		}
		
	}
	public void clickonlinks()
	{
		driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[text()='links']")).click();	
	}
    public void clickonclosebtn()
{
	
	driver.findElement(By.xpath("//*[text()='Demo Page']")).click();
	
	driver.findElement(By.xpath("//*/button[@class=\"close\"]")).click();
	Applicationutility.changewindow(1);
	driver.close();
	Applicationutility.changewindow(0);
}
}
