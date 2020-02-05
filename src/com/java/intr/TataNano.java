package com.java.intr;

public class TataNano implements TataCars,Irs{

	public void addRearEngine() {
		System.out.println("Rear Engine Added");
	}

	@Override
	public void addGPS() {
		// TODO Auto-generated method stub
		System.out.println("GPS added to nano");
	}

	@Override
	public void addRearCam() {
		// TODO Auto-generated method stub
		System.out.println("RearCam added to nano");
	}

	@Override
	public void addChildMode() {
		// TODO Auto-generated method stub
		System.out.println("ChildMode added to nano");
	}

	@Override
	public void addBs4() {
		// TODO Auto-generated method stub
		System.out.println("bs4 is added");
	}
}
