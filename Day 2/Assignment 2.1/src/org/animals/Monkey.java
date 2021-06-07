package org.animals;

public abstract class Monkey {
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
	public Monkey(String color, int age, int weight) {
		super();
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	abstract void isVegetarian() ;
	abstract void canClimb();
	abstract void sound();
}
