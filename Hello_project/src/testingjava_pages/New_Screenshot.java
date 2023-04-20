package testingjava_pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import testNG.Baselibrary;

public class New_Screenshot extends Baselibrary
{
	public static void makeScreenshot(String filename,String foldername)
	{
		String location=System.getProperty(filename, foldername);
		try {
			String path=location+"\\screenshot\\"+foldername+"\\"+filename+".png";
			EventFiringWebDriver efw=new EventFiringWebDriver(driver);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

}
