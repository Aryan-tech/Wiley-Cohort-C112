package com.wiley;

public class TollBooth implements Runnable {
	private Vehicle vehicle;
	public TollBooth(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	public TollBooth() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			vehicle.Vehicle1();	
			System.out.println(" from TollBooth..");
			vehicle.Vehicle2();	
			System.out.println(" from TollBooth..");
			vehicle.Vehicle3();	
			System.out.println(" from TollBooth..");
			vehicle.Vehicle4();	
			System.out.println(" from TollBooth..");
			vehicle.Vehicle5();	
			System.out.println(" from TollBooth..");
		
	}
}
