package com.kh.chap01.model.vo;

public class ItalyFood {
	private String foodName;
	private String material;
	private int cookingTime;
	private int oil;
	
	
	public ItalyFood() {
		
	}
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		this.foodName = foodName;
		this.cookingTime = cookingTime;
		this.material = material;
		this.oil = oil;
		
	}
	
	public String getFoodName() {
		return foodName;
	}
	public String getMaterial() {
		return material;
	}
	public int getCookingTime() {
		return cookingTime;
	}
	public int getOil() {
		return oil;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
		
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setCookingTime(int cookingTime) {
		this.cookingTime  = cookingTime;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	public String info() {
		return "["+"음식명은?"+ foodName + "재료는?"+ material + "조리시간"+ cookingTime + "오일 양"+
	oil+ "]"; 
	}

}
