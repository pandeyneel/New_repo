package datadrivernpackeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNG.Baselibrary;

public class Test_1 extends Baselibrary
{
	@BeforeTest
	public void launchbrowser()
	{
		baselibrary("https://www.demo.guru99.com/V4/");
	}
	@Test(dataProvider ="login")
	public void logintest(String user,String pass,String exp)
	{
		WebElement Id= driver.findElement(By.xpath("//*[@name=\"uid\"]"));
		WebElement Pass=driver.findElement(By.xpath("//*[@name=\"password\"]"));
		WebElement login=driver.findElement(By.xpath("//*[@name=\"btnLogin\"]"));
		WebElement reset=driver.findElement(By.xpath("//*[@name=\"btnReset\"]"));
		Id.sendKeys(user);
		Pass.sendKeys(pass);
		login.click();
		if(exp=="invalid")
			{driver.switchTo().alert().accept();}
		else{System.out.println("valid");}
		//System.out.println(driver.getTitle());
		driver.navigate().back();
		reset.click();
	}
	@DataProvider(name="login")
	public String[][]getData()
	{
		String login[][]= {
				{"mngr477222","bYmedab","valid"},
				{"ramesh","fdr","invalid"},
				{"dhimesh","dms","invalid"},
				{"abde@gmail.com","12345678a","invalid"}
				
		};
		return login;
	}

}
