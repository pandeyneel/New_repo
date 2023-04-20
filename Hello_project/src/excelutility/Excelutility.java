package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{
	public static String getreaddata(String path,int rowno,  int colomnno)
	{
		String value="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			value=sheet.getRow(rowno).getCell(colomnno).getStringCellValue();
			
			
		} catch (Exception e) {
			System.out.println("issue in getreaddata"+e);
		}
		return value;
		
	}

}
