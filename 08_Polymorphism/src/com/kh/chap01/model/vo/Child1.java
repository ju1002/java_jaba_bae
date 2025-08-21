package com.kh.chap01.model.vo;
//자식 클래스 
//부모로 부터 상속을 위해 extends활용
public class Child1 extends Parent {
	private int z;
	
	public Child1() {
		
	}
	public Child1(int x , int y ,int z) {
		super(x,y);
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void printChild1() {
		System.out.println("안녕 나는 자식이야");
	}
	@Override
	public void print() {
		System.out.println("자식 Chdild");
	}
}
