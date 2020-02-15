package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AppendData_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		String flPath= "";
		
		Workbook wb = new XSSFWorkbook(new FileInputStream(flPath));
		Sheet sht = wb.getSheet("sheet1");
		
		int rc = sht.getLastRowNum()+1;
		Row r1 = sht.createRow(rc);
		
		Cell c1 = r1.createCell(0);
		c1.setCellValue("this is temp data");
		
		FileOutputStream fo = new FileOutputStream(flPath);
		wb.write(fo);
		wb.close();
		
	}

}
