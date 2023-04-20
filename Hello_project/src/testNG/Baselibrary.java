package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrary 
{
	public static WebDriver driver;
	public void baselibrary(String  url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pakas\\git\\repository\\Hello_project\\latestchrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//line for clicking on x button at homepage
		//driver.findElement(By.xpath("//*/button[@class=\"close\"]")).click();
		//code for clicking on practice
		//driver.findElement(By.xpath("//*[text()='Practice']")).click();
		//code for clicking on element
	     //driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[1]")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//try {
			//driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
			
		//} catch (Exception e) {
			// TODO: handle exception
		//}
		//driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[4]")).click();
		//driver.findElement(By.xpath("//*/button[@data-target=\"#elements\"]")).click();
	}

}
