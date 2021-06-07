package com.wiley;
import java.util.*;
public class Matrices {
	private int rows;
	private int columns;
	private int m[][];
	Scanner sc = new Scanner(System.in);
	
	public void setRows(int rows) {
		this.rows = rows;
	}
	Matrices(){
		
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public Matrices(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.m = new int[this.rows][this.columns];
		System.out.println("Enter the "+ (rows * columns) + "values in Matrix:");
		put();
	}
	
	public  void put() {
		for(int i = 0; i< rows;i++) {
			for(int j = 0; j < columns;j++) {
				m[i][j] = sc.nextInt();
			}
		}
	}
	public void add(Matrices o1 ) {
		
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j < columns;j++) {
				this.m[i][j] = o1.m[i][j] + this.m[i][j];
			}
		}
	}
	public void display(Matrices m1) {
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j < columns;j++) {
				System.out.print(this.m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
