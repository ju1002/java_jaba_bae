package com.kh.chap03.model.vo;

public abstract class Sports {
	
	private int peopleCount;
	
	public Sports() {}
	
	public Sports(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	public int getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(int peopleCount) {
		this.peopleCount= peopleCount;
	}
	//public void rule() {
	//	System.out.println("저는규칙이에요");
	//}
	
	public abstract void rule();


	
}
