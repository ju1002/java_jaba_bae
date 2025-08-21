package com.kh.chap02.model.vo;
//자식
public class KoreaFood extends Food{
	//food클래스만 가지고 있는 부분
	private int spicy;
	public KoreaFood() {
		super();
		System.out.println("응애응애 나 자식이얌");
		
	}
	 public int getSpicy() {
		 return spicy;
	 }
	 public void setSpicy() {
		 this.spicy =spicy;
	 }


}
