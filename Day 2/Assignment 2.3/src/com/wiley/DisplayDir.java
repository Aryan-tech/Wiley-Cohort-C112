package com.wiley;

import java.util.Set;
import java.util.TreeSet;

public class DisplayDir {
	Set<TelDirectory> data = new TreeSet<TelDirectory>(new ArrangeName());
	void enter() {
	
	data.add(new TelDirectory("Raj" , "928456"));
	data.add(new TelDirectory("Aryan" , "123345"));
	data.add(new TelDirectory("Arshit" , "658296"));
	data.add(new TelDirectory("Vivek" , "456985"));
	}
	void display() {
		System.out.println("Directory available are : ");
		for(TelDirectory element: data) {
			System.out.println(element.toString());
		}
	}
}
