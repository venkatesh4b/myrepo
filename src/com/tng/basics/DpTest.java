package com.tng.basics;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DpTest {
  @Test(dataProvider = "genData")
  public void t2(String p1) {
	  System.out.println("this is t2 test method");
  }

  @DataProvider
  public String[][] genData() {
	  
	     //1st dimension controls no of times method executes
		//2nd dimension controls no of parameters method contains
   
	  String tcData[][] = new String[2][1];
	  //1st row
	  tcData[0][0]="aaa";
	  //2nd time
	  tcData[0][1]="bbb";
	  
	  return tcData;
	  
  }
}
