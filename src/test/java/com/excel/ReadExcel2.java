package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel2 {
	
	@Test(dataProvider = "excelRead")
	public void loginTest(String fname , String lanme ,String city , String pincode, String mb)
	{
		//
		System.out.println(fname  + lanme +city +pincode  +mb);
	//
		
			
	}

	@DataProvider
	public Object[][] excelRead() throws IOException {
		File file = new File("F:\\ExcelRead\\Test1.xlsx");

		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet2");
		int rowlastsno = sheet.getLastRowNum();
		
		int cellLastno =sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[rowlastsno+1][cellLastno];
		
		
		for(int i = 0 ; i <= rowlastsno ; i++)// row
		{
			for(int j = 0 ; j< cellLastno ;j++)
			{
				Cell c =sheet.getRow(i).getCell(j);
				
				if(c.getCellType() == c.CELL_TYPE_STRING)
				{
					obj[i][j] = c.getStringCellValue();
				}
				else if(c.getCellType() == c.getNumericCellValue())
				{
					String v=String.valueOf(c.getNumericCellValue());  
					System.out.println(v);
					obj[i][j]  = v;
				}
				
				
			}
		}
		
		return obj;
		
	}

}
