package testingjava_pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import excelutility.Excelutility;
import testNG.Baselibrary;

public class Testbox_page extends Baselibrary
{
	String path="C:\\Users\\pakas\\Downloads\\Untitled spreadsheet.xlsx";
	
	public Testbox_page()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	@FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[1]")
	private WebElement textbox;
 @FindBy(xpath="//*[@id=\"fullname1\"]")
 private WebElement nametextbox;
 
 @FindBy(xpath="//*[@id=\"fullemail1\"]")
 private WebElement emailtextbox;
 

 @FindBy(xpath="//*[@id=\"fulladdresh1\"]")
 private WebElement currenttextbox;
 
 @FindBy(xpath="//*[@id=\"paddresh1\"]")
 private WebElement permanenttextbox;
 
 @FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
 private WebElement submitbutton;
 
 public void textbox()
 {
	 textbox.click();
 }
 public void elements()
 {
	 elements.click();
 }
 public void getfilldetails()
 {
	 nametextbox.sendKeys(Excelutility.getreaddata(path, 1, 0));
	 emailtextbox.sendKeys(Excelutility.getreaddata(path, 1, 1));
	 currenttextbox.sendKeys(Excelutility.getreaddata(path, 1, 2));
	permanenttextbox.sendKeys(Excelutility.getreaddata(path, 1, 3));
	
 }
 public void clicksubmit()
 {
	 submitbutton.click();
 }
 public void getvarrified()
 {
	 ArrayList<String>actualdata=new ArrayList<String>();
	 actualdata.add(Excelutility.getreaddata(path, 1, 0));
	 actualdata.add(Excelutility.getreaddata(path, 1, 1));
	 actualdata.add(Excelutility.getreaddata(path, 1, 2));
	 actualdata.add(Excelutility.getreaddata(path, 1, 3));
	 ArrayList<String>expected=new ArrayList<String>();
	 List<WebElement> li=driver.findElements(By.xpath("//*[@class=\"col-md-6 mt-5\"]/label"));
	 
	 for(int i=1;i<=li.size()-1;i++)
	 {
		 String data=li.get(i).getText();
		 expected.add(data);
		 i++;
	 }
	 for(int k=0;k<=actualdata.size()-1;k++)
	 {
		Assert.assertEquals(actualdata.get(k), expected.get(k)); 
	 }
 }
}
