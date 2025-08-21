package com.kh.chap01.model.vo;

//부모 클래스 역할
public class Parent {

	private int x;
	private int y;

	public Parent() {

	}

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void printParent() {
		System.out.println("안녕 부모야");
	}
	public void print(){
		System.out.println("dsfsdf");
	}
}
