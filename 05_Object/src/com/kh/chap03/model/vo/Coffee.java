package com.kh.chap03.model.vo;

public class Coffee {
	
	
//	상품명
//	가격
//	원두 어디꺼 쓰는지
//	크기
//	필드부
	private String name;
	private String bean;
	private int price;
	private int size;
//	생성자부
//	메소드부 getter / setter / info 를 통해 캡슐화 함
//  필드값을 반환해주는 메소드 == getter
	public String getName() {
		return name;
	}
	public String getBean() {
		return bean;
	}
	public int getprice() {
		return price;
	}
	public int size() {
		return size;
	}
//	밖에서 부터 받아야 함 클래스 내부가 아니라 때문에 public으로 바꿔줌 그 후 자료형이 맞게 int나 String 등 바꿔야 함 
//	return을 통해 받아야 할 값을 정함 그게 size라고하면 size
//	필드값을 셋팅해주는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String info() {
		String info = "상품명:" + name
					+",원두 : "+ bean
					+ " , 가격 :" + price
					+", 크기 : " + size;
		return info; //필드들의 집합
		
	}
	
	

}
