package com.wiley;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrangeCd {
	Set<Cd> data = new TreeSet<Cd>(new AscendingSinger());
	void enter() {
	
	data.add(new Cd("Dynamite" , "BtS"));
	data.add(new Cd("Let's Kill this love" , "BlackPink"));
	data.add(new Cd("Subhanallah" , "Arijit Singh"));
	data.add(new Cd("Bentihaan" , "Atif Aslam"));
	}
	void display() {
		System.out.println("Cd available are : ");
		for(Cd element: data) {
			System.out.println(element.toString());
		}
	}
}
