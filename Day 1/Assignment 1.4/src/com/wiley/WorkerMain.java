package com.wiley;
import java.util.*;
public class WorkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int hours;
		float rate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of Daily Worker: ");
		System.out.println("Enter Name of Daily Worker: ");
		name = sc.next();
		System.out.println("Enter hours of Daily Worker: ");
		hours = sc.nextInt();
		System.out.println("Enter Pay Rate of Daily Worker: ");
		rate = sc.nextFloat();
		Worker d = new DailyWorker(name , rate , hours);
		System.out.println("Salary :"+ d.Pay());
		
		System.out.println("Enter details of Salaried Worker: ");
		System.out.println("Enter Name of Salaried Worker: ");
		name = sc.next();
		System.out.println("Enter hours of 	Salaried Worker: ");
		hours = sc.nextInt();
		System.out.println("Enter Pay Rate of Salaried Worker: ");
		rate = sc.nextFloat();
		Worker s = new SalariedWorker(name , rate , hours);
		System.out.println("Salary :"+ s.Pay());
	}

}
