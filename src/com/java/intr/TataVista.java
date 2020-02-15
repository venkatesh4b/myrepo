package com.java.intr;

public class TataVista implements TataCars,Irs{

	public void addMoreBootSpace() {
		System.out.println("Bootspace added to vista");
	}

	@Override
	public void addGPS() {
		// TODO Auto-generated method stub
		System.out.println("GPS added to vista");
	}

	@Override
	public void addRearCam() {
		// TODO Auto-generated method stub
		System.out.println("RearCam added to vista");
	}

	@Override
	public void addChildMode() {
		// TODO Auto-generated method stub
		System.out.println("ChildMode added to vista");
	}
	@Override
	public void addBs4() {
		// TODO Auto-generated method stub
		System.out.println("bs4 is added");
	}
}
