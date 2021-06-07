package com.wiley;

public class TelDirectory {
	private String Name;
	private String Number;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public TelDirectory(String name, String number) {
		super();
		Name = name;
		Number = number;
	}
	public TelDirectory() {
		
	}
	@Override
	public String toString() {
		return "TelDirectory [Name=" + Name + ", Number=" + Number + "]";
	}
}
