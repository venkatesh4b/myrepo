package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		// hsssf: for xls files : horrible spread sheet format
		//xssf: for xlsx files : xml spread sheet format
		
		String flPath="";
		
		Workbook wb;
		if (flPath.endsWith(".xlsx")) {
			wb= new XSSFWorkbook(new FileInputStream(flPath));
	
		} else {
			wb= new HSSFWorkbook(new FileInputStream(flPath));
		}
		
		
		//get work sheet
		Sheet sht = wb.getSheet("sheet1");
		
		//get row count
		int rc = sht.getLastRowNum();
		
		//get column count
        int cc = sht.getRow(0).getLastCellNum();
        
        for (int r = 1; r <=rc; r++) {
        	
        	for (int c = 0; c <cc; c++) {
        		
        	
        		
        		System.out.println(	sht.getRow(r).getCell(c, MissingCellPolicy.RETURN_NULL_AND_BLANK).toString());
				
			}
			
		}
        
        wb.close();    
	}

  }
