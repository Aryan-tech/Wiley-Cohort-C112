package com.wiley;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws NameException {
											// TODO Auto-generated method stub
		EmployeeInput ei = new EmployeeInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee Portal...");																																																																																																																																																																																																																																																																													
		while(true) {
			System.out.println("Enter your choice: 1 - Add , 2 - Display , 3 - Exit");
			int n = sc.nextInt();
		switch(n) {	
			case 1:
				System.out.println("Enter Name :");
				String s = sc.next();
				System.out.println("Enter age :");
				int age = sc.nextInt();
				ei.add(s, age);
				break;
			case 2:
				ei.display();
				break;
			case 3:
				System.exit(0);
		}
	}
}

}
