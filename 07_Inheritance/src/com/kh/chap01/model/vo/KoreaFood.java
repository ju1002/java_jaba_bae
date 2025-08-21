package com.kh.chap01.model.vo;

public class KoreaFood {
	private String foodName;
	private String material;
	private int cookingTime;
	private int spicy;
	
	
	public KoreaFood() {
		
	}
	public KoreaFood(String foodName , String material, int cookingTime
			,int spicy) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.spicy = spicy;
		
	}
	public String getFoodName() {
			return foodName ;}
	public String getMaterial() {
		return material;
	}
	public int getCookingTime() {
		return cookingTime;
	}
	public int getSpicy() {
		return spicy;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setCookingTimr(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	public String info(){ 
		return "["+ "음식명은?"+foodName + "재료는?"+ material + "조리시간은?"+ cookingTime
					+ "맵기 정도는?"+ spicy+ "]";}
		
	}


