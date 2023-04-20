package failedtests;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excelutil 
{
	public static String getreaddata(String path,int row,int col)
	{String value="";
	try {
		FileInputStream fis=new FileInputStream(path);
		HSSFWorkbook wp=new HSSFWorkbook(fis);
		HSSFSheet sheet=wp.getSheetAt(0);
		value=sheet.getRow(row).getCell(col).getStringCellValue();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
		return value;
		
	}

}
