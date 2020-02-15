package com.files.handle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sht1= wb.createSheet("sheet1");
		Row r1 = sht1.createRow(0);
		Cell cl = r1.createCell(0);
		
		cl.setCellValue("this is temp data");
		
		String flPath="E:\\Selenium Project Basics\\Data\\output.xlsx";
		
		FileOutputStream fo = new FileOutputStream(flPath);
		wb.write(fo);
		wb.close();
		
		
		
		

	}

}
