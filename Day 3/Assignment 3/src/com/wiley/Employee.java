package com.wiley;

public class Employee {
	private String Name;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) throws NameException {
		super();
		EmployeeInput e1 = new EmployeeInput();
		e1.add(name, age);
		Name = name;
		if((age > 60) || (age < 18)) {
			throw new AgeException("Your age is not valid...");
		}
		this.age = age;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", age=" + age + "]";
	}
}
