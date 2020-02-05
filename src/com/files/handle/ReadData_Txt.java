package com.files.handle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Txt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String flPath="E:\\Selenium Project Basics\\Data\\demo.txt";
		
		FileReader fr= new FileReader(flPath);
		BufferedReader br= new BufferedReader(fr);
		String str = br.readLine();
		
		while (str!=null) {
			
			System.out.println(str);
			str=br.readLine();
			
		}

	}

}
