package testingjava_pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import testNG.Baselibrary;

public class Screenshot_utility extends Baselibrary
{
	public static void getscreenshot(String foldername,String  filename)
	{
		String location=System.getProperty("user.dir");
		try {
			String path=location+"\\Screenshot\\"+foldername+"\\"+filename+".png";
			EventFiringWebDriver efw=new EventFiringWebDriver(driver);
			File src=efw.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("issue is getting screenshot");
		}
	}

}
