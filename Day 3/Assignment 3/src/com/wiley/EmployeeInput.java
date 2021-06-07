package com.wiley;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInput {
	List<Employee > employee = new ArrayList<>();
	List<String> Name = new ArrayList<>();
	Employee e = new Employee();
	void add(String s , int age ) throws NameException {
		if(Name.contains(s)) {
			throw new NameException("You re-entered the name again");
		}
		Name.add(s);
		employee.add(new Employee(s ,age));
	}
	void display() {																																																																																																																																																																																																																																																																																																																																		
		for(Employee e : employee) {
			System.out.println(e);
		}
	}
}
