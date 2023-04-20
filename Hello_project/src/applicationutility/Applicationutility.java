package applicationutility;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testNG.Baselibrary;

public class Applicationutility extends Baselibrary 
{
	public static void doubleclick(WebElement ele)
	{
		Actions act=new  Actions(driver);
		act.doubleClick(ele).perform();
	}
	public static void rightClick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	public static void changewindow(int tabno)
	{
		Set<String>set= driver.getWindowHandles();
		ArrayList<String>li=new ArrayList<String>(set);
		driver.switchTo().window(li.get(tabno));
		
	}
	public static void fileupload(String filename)
	{
		try {
			StringSelection sel=new StringSelection(filename);
			Clipboard Clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			Clipboard.setContents(sel, null);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(250);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception e) {
			System.out.println("issue in file uploading");
			
		}
		
		
		
		
	}
	public static String datepic()
	{
		String date="";
		try {
			SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
			Date sp=new Date();
			date=sf.format(sp);
			
			
		} catch (Exception e) {
			
		}
		return date;
		
	}

}
