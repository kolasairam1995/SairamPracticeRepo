package Utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ConstantsData.ConstantData;


public class FetchDataFromExcel {
	
	public static String getDataFromExcel(int x, int y) throws IOException
	{		
		FileInputStream fi = new FileInputStream(ConstantData.Excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFCell c = sh.getRow(x).getCell(y);
		String val=c.toString();
		wb.close();
		return val;				
	}
	
	
	
	
	
	
	
	
	
	
}
