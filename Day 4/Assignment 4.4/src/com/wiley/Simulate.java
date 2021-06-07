package com.wiley;

public class Simulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		Thread Bg = new Thread(new BridgeSimulate(vehicle));
		Thread Tb = new Thread(new TollBooth(vehicle));
		
		Bg.start();
		Tb.start();
	}

}
