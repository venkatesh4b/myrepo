package com.wd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFactory {
	
	public static HashMap<String, String> getTCData(String tcid) throws FileNotFoundException, IOException {
		
		String flPath= GlobalData.dtFilePath;
		String shtName= GlobalData.dtGlobalSheetName;
		
		//getWorkbook
		Workbook wb;
		if (flPath.endsWith(".xslx")) {
			wb = new XSSFWorkbook(new FileInputStream(flPath));
			} else {
			wb= new HSSFWorkbook(new FileInputStream(flPath));
			}
		//get sheet name
		Sheet sht = wb.getSheet(shtName);
		//get row count
		int rc = sht.getLastRowNum();
		
		int cc = sht.getRow(0).getLastCellNum();
		
		HashMap<String, String> tcData = new HashMap<>();
		
		for (int r = 1; r <=rc; r++) {
			
			if(sht.getRow(r).getCell(0).toString().equalsIgnoreCase(tcid)) {
				for(int c=0;c<cc;c++) {
					String kName = sht.getRow(0).getCell(c).toString();
					String kVal = sht.getRow(r).getCell(c, MissingCellPolicy.RETURN_NULL_AND_BLANK).toString();
					tcData.put(kName, kVal);
				}	
				
				break;
			
		}
		
		}
		
		wb.close();
		
		return tcData;

    }
	}
