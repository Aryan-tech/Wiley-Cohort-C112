package com.wiley;

public class CalcOfEggs {
	
	private int total_eggs;
	int gross_egg, dozen_egg , rem;
	public void setTotal_eggs(int total_eggs) {
		this.total_eggs = total_eggs;
	}
	public void converted_eggs(){
		
		gross_egg = total_eggs / 144;
		total_eggs %= 144;
		dozen_egg = total_eggs /12;
		total_eggs %= 12;
		rem = total_eggs;
		
		
	}
	 
 
}
