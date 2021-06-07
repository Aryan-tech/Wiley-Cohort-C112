package com.wiley;

public class AddMatrices {
	public static void main(String args[]) {
		Matrices matrices = new Matrices(3,3);
		Matrices obj1 = new Matrices(3,3);
		matrices.add(obj1);
		System.out.println("Addition for the matrices is : ");
		matrices.display(matrices);
	}
}
