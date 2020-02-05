package com.tng.basics;

import org.testng.annotations.Test;

import com.wd.util.GlobalData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class OhrmDP {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] getEmpData() throws FileNotFoundException, IOException {
	  
	 String flPath = GlobalData.dtFilePath;
	 //get workbook
	 Workbook wb;
	 if (flPath.endsWith(".xlsx")) {
		wb= new XSSFWorkbook(new FileInputStream(flPath));
		
	}else {
	 
	 wb= new HSSFWorkbook(new FileInputStream(flPath));
	}
	 
	 //get sheet
	 
	 Sheet sht = wb.getSheet("Sheet1");
	 
	 //get row count
	 int rc = sht.getLastRowNum();
	 
	 System.out.println(rc);
	 
	 Object[][] tcData= new Object[rc][1];
	 
	 //get column count
	 
	 int cc = sht.getRow(0).getLastCellNum();
	 
	 for (int r = 1; r <= rc; r++) {
		 
		 HashMap<String, String> tcMap= new HashMap<>();
		 
		 for (int c = 0; c < cc; c++) {
			 
			 String KName = sht.getRow(0).getCell(c, MissingCellPolicy.RETURN_NULL_AND_BLANK).toString();
			 String KValue = sht.getRow(r).getCell(c, MissingCellPolicy.RETURN_NULL_AND_BLANK).toString();
			 
			 tcMap.put(KName, KValue);
			
		}
		 tcData[r-1][0]=tcMap;	
	}
	 wb.close();
	 return tcData;
}
  }
