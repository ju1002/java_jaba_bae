package com.kh.hw.person.model.vo;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super();//부모꺼에서 불러오는 거여서 따로 안적어도 됨 
		this.salary =salary;
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
		return super.toString()+"급여"+salary+"부서"+dept;
	}
	

}
