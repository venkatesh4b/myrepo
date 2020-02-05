package com.java.intr;

public class CreateTataCar {

	public static void main(String[] args) {
		
		TataNano car1 = new TataNano();
		car1.addChildMode();
		car1.addGPS();
		car1.addRearCam();
		car1.addRearEngine();
		
		TataCars car2 = new TataNano();
		car2.addChildMode();
		car2.addGPS();
		car2.addRearCam();
		
		TataVista car3 = new TataVista();
		car3.addChildMode();
		car3.addGPS();
		car3.addMoreBootSpace();
		car3.addRearCam();
		
		TataCars car4 = new TataNano();
		car4.addChildMode();
		car4.addGPS();
		car4.addRearCam();		

		Irs car5 = (Irs) car4;
		car5.addBs4();
	}

}









