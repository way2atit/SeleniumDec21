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

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		File file = new File("F:\\ExcelRead\\Test1.xlsx");

		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet2");

		Iterator<Row> itrow = sheet.iterator();
		while (itrow.hasNext()) {
			Row r = itrow.next(); // 1, 2, 3

			Iterator<Cell> itcell = r.iterator();
			while (itcell.hasNext()) {
				Cell c = itcell.next();

				if (c.getCellType() == c.CELL_TYPE_STRING) {
					System.out.println(c.getStringCellValue());
				} else if (c.getCellType() == c.CELL_TYPE_NUMERIC) {
					
					//System.out.println(c.getNumericCellValue());
					String v = String.valueOf(c.getNumericCellValue());
					System.out.println(v);
				}

			}

		}

		// -------------------------For Loop------------
		/*
		 * int lastrowno = sheet.getLastRowNum();
		 * System.out.println("last Row No : "+lastrowno);
		 */

		/*
		 * for(int i = 0; i <= lastrowno ; i++ ) // row { for(int j = 0 ; j <2 ; j++) {
		 * 
		 * String v = sheet.getRow(i).getCell(j).getStringCellValue();
		 * System.out.println(v); }
		 * 
		 * }
		 */

		/*
		 * String v = sheet.getRow(1).getCell(1).getStringCellValue();
		 * System.out.println(v);
		 */

		/*
		 * Row row = sheet.getRow(2);
		 * 
		 * Cell cell =row.getCell(1);
		 * 
		 * String value = cell.getStringCellValue(); System.out.println(value);
		 */

	}

}
