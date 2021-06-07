package com.wiley;

public class Vehicle {
	private int i = 0;
	synchronized void Vehicle1() {
	while(i !=	0) {
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		System.out.print("Vehicle"+ (i+1)+" is moving");
		i = 1;
		notifyAll();
	
	}
	synchronized void Vehicle2() {
		while(i !=	1) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			System.out.print("Vehicle"+ (i+1)+" is moving");
			i = 2;
			notifyAll();																																																																	
		
		}
	synchronized void Vehicle3() {
		while(i !=	2) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			System.out.print("Vehicle"+ (i+1)+" is moving");
			
			i = 3;
			notifyAll();																																																																																																																			
		
		}	
	synchronized void Vehicle4() {
		while(i !=	3) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			System.out.print("Vehicle"+ (i+1)+" is moving");
			i = 4;
			notifyAll();																																																																																																																			
		
		}
	synchronized void Vehicle5() {
		while(i !=	4) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			System.out.print("Vehicle"+ (i+1)+" is moving");
			i = 0;
			notifyAll();																																																																																																																			
		
		}
}
