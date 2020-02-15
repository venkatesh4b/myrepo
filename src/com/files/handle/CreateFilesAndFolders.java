package com.files.handle;

import java.io.File;

public class CreateFilesAndFolders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fpath="E:\\Selenium Project Basics\\Data";
		
		
		File fl= new File(fpath+"\\d1\\d2\\d3");
		//fl.mkdir();//create single folder
		fl.mkdirs();//create folder path 
		
		System.out.println(fl.isDirectory());
		
		System.out.println(fl.isFile());

	}

}
