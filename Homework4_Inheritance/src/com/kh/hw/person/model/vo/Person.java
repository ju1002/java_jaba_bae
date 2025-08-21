package com.kh.hw.person.model.vo;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		
	}
	public Person(String name , int age, double height , double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		
	}
	public String getName() {
		return name;
	}
	public int getage() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public void setName() {
		this.name = name;
	}
	public void setAge() {
		this.age = age;
	}
	public void setHeight() {
		this.height = height;
	}
	public void setWeight() {
		this.weight = weight;
	}
	public String toString() {
		return "이름"+name+"나이"+ age+"키"+height+"무게"+weight;	}
}
