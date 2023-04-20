package testNG;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Checkjava 
{
	public void check() throws IOException
	{
		FileReader reader=new FileReader("C:\\Users\\pakas\\git\\repository\\Hello_project\\Configs\\Configuration.properties");
		Properties prop=new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("pass"));
		System.out.println(prop.get("userid"));
	}
	public static void main(String[] args) throws IOException 
	{
		Checkjava ob=new Checkjava();
		ob.check();
		
	}

}
