package simplejava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testNG.Baselibrary;

public class Screenshotutility extends Baselibrary
{
	public void screenshot(String passed) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\pakas\\git\\repository\\Hello_project\\Screenshot\\Failed"+passed+".png"));
	}

}
