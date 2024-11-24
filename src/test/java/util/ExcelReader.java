package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	XSSFWorkbook workbook = null;
	Logger logg = (Logger) LogManager.getLogger(ExcelReader.class);
	
	public ExcelReader(String path) 
	{
		try
		{
			FileInputStream inputStream = new FileInputStream(path);		
			 workbook = new XSSFWorkbook(inputStream);
		}catch(Exception e)
		{
			logg.error(e.getMessage());
		}
		
		
	}
		
	public ArrayList<Object> getData(String sheetName)
	{
		ArrayList<Object> valuePairs = new ArrayList<Object>();
		ExcelData xlData = null;
				
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow firstRow = sheet.getRow(0);
					
		int noOfRows = sheet.getLastRowNum();
		int noofCols = firstRow.getLastCellNum();
				
		for(int i=0;i<=noOfRows;i++)
		{
			
			XSSFRow row  = sheet.getRow(i);
			ArrayList<Object> a = new ArrayList<Object>();			
			for(int j=0;j<noofCols;j++)
			{			
				
				String value = row.getCell(j).getStringCellValue();
				a.add(value);				
				
			}			
//			xlData = new ExcelData();
//			xlData.setUsername(a.get(0).toString());			
//			xlData.setPassword(a.get(1).toString());
			
			valuePairs.add(a);
		}
		
		return valuePairs;
	}
	
	public ExcelData getRegisterData(String sheetName)
	{
		ArrayList<Object> valuePairs = new ArrayList<Object>();
		ExcelData xlData = null;

		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow firstRow = sheet.getRow(0);



		int noOfRows = sheet.getLastRowNum();
		int noofCols = firstRow.getLastCellNum();
		
		XSSFRow row  = sheet.getRow(0);	
		ArrayList<String> a =  new ArrayList<String>();

		for(int j=0;j<noofCols;j++)
		{			
			
			
				String value = row.getCell(j).getStringCellValue();
				System.out.println("BBBBBBBBBBBBBB"+j+ value);
				a.add(value);				
			
		}			
		xlData = new ExcelData();

		xlData.setUsername(a.get(0).toString());			
		xlData.setPassword(a.get(1).toString());
		xlData.setCnfPassword(a.get(2).toString());

		return xlData;
	}
	
	public void workbookClose() throws IOException
	{
		workbook.close();		
	}
	
	
}


