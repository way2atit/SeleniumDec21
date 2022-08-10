package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
		
		// 
		// company list --- 
		
		
		List<String> allcompnayname = new ArrayList<String>();
		allcompnayname.add("A");
		allcompnayname.add("B");
		allcompnayname.add("C");
		allcompnayname.add("TATA");
		allcompnayname.add("COngni");
		
		
		File file = new File("F:\\ExcelRead\\Test1.xlsx");

		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet4");
		int lastrow = sh.getLastRowNum()+1; // 0
		
		
		for(int i =0 ; i < allcompnayname.size() ;i++)
		{
			sh.createRow(lastrow).createCell(0).setCellValue(allcompnayname.get(i));
			lastrow++;
		
		}
		
		System.out.println("***");
		
		
		
		
		
		
		
		
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		
		System.out.println("****");
		
		
	}

}
