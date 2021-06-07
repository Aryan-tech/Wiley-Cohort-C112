package com.wiley;

import java.util.Comparator;

public class AscendingSinger implements Comparator<Cd> {

	@Override
	public int compare(Cd o1, Cd o2) {
		// TODO Auto-generated method stub
		if((o1.getSinger()).compareTo(o2.getSinger()) == 0) {
			return 0;
		}
		else if((o1.getSinger()).compareTo(o2.getSinger()) > 0) {
			return 1;
		}
		return -1;
	}
	
}
