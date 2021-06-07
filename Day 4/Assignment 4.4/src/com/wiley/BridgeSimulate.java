package com.wiley;

public class BridgeSimulate implements Runnable{
	private Vehicle vehicle;
	public BridgeSimulate(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			vehicle.Vehicle1();	
			System.out.println(" from Bridge..");
			
			vehicle.Vehicle2();	
			System.out.println(" from Bridge..");
		
			vehicle.Vehicle3();	
			System.out.println(" from Bridge..");
			
			vehicle.Vehicle4();	
			System.out.println(" from Bridge..");
			
			vehicle.Vehicle5();	
			System.out.println(" from Bridge..");
			
	
	}
}
