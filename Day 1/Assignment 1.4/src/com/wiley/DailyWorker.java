package com.wiley;

public class DailyWorker extends Worker{
	private int hours;

	public DailyWorker(String Name, float Rate ,int hours) {
		super(Name , Rate);
		this.hours = hours;
	}
	public float Pay() {
		int days = hours /7;
		return days*getSalaryRate();
	}
}
