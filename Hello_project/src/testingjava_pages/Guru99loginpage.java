package testingjava_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import excelutility.Excelutility;
import testNG.Baselibrary;

public class Guru99loginpage extends Baselibrary
{
	String path="C:\\Users\\pakas\\eclipse-workspace\\newbatchnileshpandey\\Hello_project\\testdata\\Book 3.xlsx";
	public Guru99loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@name=\"uid\"]")
	private WebElement id;
	@FindBy(xpath = "//*[@name=\"password\"]")
	private WebElement password;
	@FindBy(xpath = "//*[@name=\"btnLogin\"]")
	private WebElement login;
	
	public void filltheid()
	{
		id.sendKeys(Excelutility.getreaddata(path, 1, 1));
	}
	public void fillpassword()
	{
		password.sendKeys(Excelutility.getreaddata(path, 0, 1));
	}
	public void clickonlogin()
	{
		login.click();
	}
	public void getvarification() throws InterruptedException
	{
		Thread.sleep(2000);
		
		try {
			if(driver.getTitle().equals("Manager's Page of Guru99 Bank"))
			{
				System.out.println("The varification is passed");
			}
			else {
				System.out.println("Username or password is incorrect");
				String text=driver.switchTo().alert().getText();
				System.out.println(text);
				System.out.println(driver.getTitle());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("falling in Catch");
		}
	}
	

}
