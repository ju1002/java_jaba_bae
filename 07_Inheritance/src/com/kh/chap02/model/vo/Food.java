package com.kh.chap02.model.vo;
//부모
public class Food {
	private String foodName;
	private String material;
	private int cookingTime;
	
	
	
	public Food() {
		System.out.println("안녕하세요 부모인데유");
		
		
	}
	public Food(String foodName , String material, int cookingTime) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
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
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public void setMaterial(String material) {
		this.material =material;
	}
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	public String info() {
		return "음식명"+foodName + "재료"+material+ "조리시간"+ cookingTime;	}
}
