package com.wiley;

public class SalariedWorker extends Worker{
	private int hours;

	public SalariedWorker(String Name, float rate, int hours) {
		super(Name , rate);
		this.hours = hours;
	}
	public float Pay() {
		int count = hours /40 ;
		return count*getSalaryRate();
	}
}
