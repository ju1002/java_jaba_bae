package com.kh.chap02.model.vo;

public class ItalyFood extends Food{
	private int oil;
	
	public ItalyFood() {
		
	}
	public ItalyFood(String foodName , String material,int cookingTime
			,int oil) {
		//접근제한자가 private이어서 직접적을 못넣음
		//super.setFoodName(foodName);
		//super.setMaterial(material);
		//super.setCookingTime(cookingTime);
		super(foodName, material, cookingTime);
		//부모꺼는 생성자 호출해서 넣음
		this.oil = oil;
		//oil은 내꺼니까 내 클래스 안에서 값 대입
	}
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	
}
