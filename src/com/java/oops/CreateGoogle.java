package com.java.oops;

//import com.java.access.Gmail1;

public class CreateGoogle {

	public static void main(String[] args) {
		Gmail gm = new Gmail();
		gm.Login("selenium", "asdf");
		
		Google g = new Google();
		g.Login("google user", "1234");
		
		Google g1 = new Gmail();
		g1.Login("webdriver", "zxcv");
		g1.logout();
	}

}
