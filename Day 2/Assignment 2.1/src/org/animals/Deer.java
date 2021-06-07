package org.animals;

public class Deer implements Animal{
	private String color;
	private int age;
	private int weight;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Deer(String color, int age, int weight) {
		//super();
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	public Deer() {
		
	}
	public  void isVegetarian() {
		 System.out.println("I am "+ getColor() +"deer Vegetarian");
	 }	
	public void canClimb() {
		
	}
	public 	void sound() {
		
	}
}
