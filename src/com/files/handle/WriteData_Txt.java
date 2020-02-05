package com.files.handle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData_Txt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String flPath="E:\\Selenium Project Basics\\Data\\demo.txt";
		
		
		//true will append the data
		
		FileWriter fw = new FileWriter(flPath, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("test1");
		bw.newLine();
		
		bw.write("test2");
		bw.newLine();
		
		bw.write("test3");
		bw.newLine();
		
		bw.write("test4");
		bw.newLine();
		
		bw.write("test5");
		bw.newLine();
		
		bw.close();
		fw.close();

	}

}
