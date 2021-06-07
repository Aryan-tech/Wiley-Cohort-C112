package com.wiley;
import java.util.Comparator;																																																																																																																																														
public class ArrangeName implements Comparator<TelDirectory>{
	public int compare(TelDirectory o1, TelDirectory o2) {
		// TODO Auto-generated method stub
		if((o1.getName()).compareTo(o2.getName()) == 0) {
			return 0;
		}
		else if((o1.getName()).compareTo(o2.getName()) > 0) {
			return 1;
		}
		return -1;
	}
}
