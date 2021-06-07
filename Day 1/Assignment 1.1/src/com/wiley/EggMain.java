package com.wiley;
import java.util.*;
public class EggMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of eggs: "); 
		int number = sc.nextInt();
		CalcOfEggs e = new CalcOfEggs();
		e.setTotal_eggs(number);
		e.converted_eggs();
		//e.set();
		EggUnit eu = new EggUnit(e.gross_egg,e.dozen_egg,e.rem);
		System.out.print("There are "+ eu.getGross()+ " Gross eggs " + eu.getDozen()+ " Dozen eggs and "+ eu.getRemain() + " Remaining");
	}

}
