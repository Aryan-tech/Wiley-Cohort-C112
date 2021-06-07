package com.wiley;

public class EggUnit {
	private  int gross;
	private int dozen;
	private int remain;
		
		public int getGross() {
		return gross;
	}
	public void setGross(int gross) {
		this.gross = gross;
	}
	public EggUnit(int gross, int dozen, int remain) {
		super();
		this.gross = gross;
		this.dozen = dozen;
		this.remain = remain;
	}
	public int getDozen() {
		return dozen;
	}
	public void setDozen(int dozen) {
		this.dozen = dozen;
	}
	public int getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
		
	

}
